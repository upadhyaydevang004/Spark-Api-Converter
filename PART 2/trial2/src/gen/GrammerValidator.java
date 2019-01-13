import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.antlr.runtime.tree.ParseTree;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.TerminalNode;

public class GrammerValidator {

	public boolean validate(String line) {
		try {
			int count = 0;
			String temp = null;
			CharStream charStream = new ANTLRInputStream(line);;
			gramLexer lexer = new gramLexer(charStream);
			boolean mapStart = false;
			String temp1 = null;
			String val = null;
			boolean ComplexExpr = false;
			 boolean SimpleExpr = false;
			   boolean ifstmt = false;
			HashMap<String, String> hmap = new HashMap<String, String>();
			Iterator it;
			 List<? extends Token> tokenList = new ArrayList<>();
			 String output = "";
			   tokenList = lexer.getAllTokens();
			   for(Token token : tokenList) {
				   
				  
				if(token.getType() == 1)
					output = output + "spark.range(";
				   else if(token.getType() == 8)
					   output = output + token.getText() + ").selectExpr(\"id as _1\")";
				   else if(token.getType() == 3) {
					   mapStart = true;
					   output = output + ".selectExpr(";
				   }
				
				   else if (!ComplexExpr && token.getType() == 5) {
					   hmap.put(token.getText(),"_1");
				   }
					
			//start of complex Expression	: val XX = XX
				   else if((token.getType() == 14  && token.getText().equals("{")) || token.getType() == 23)
					   ComplexExpr = true;
					   else if(token.getType() == 9 && mapStart && ComplexExpr) {
						   temp1 = token.getText();
						   String[] splited = temp1.split("=");
						   splited[0] = splited[0].replaceAll("val ", "");
						   it = hmap.entrySet().iterator();
						   while (it.hasNext()) {
							Map.Entry pair = (Map.Entry)it.next();
							splited[1] = splited[1].replaceAll(pair.getKey().toString(),pair.getValue().toString());
						   }
						   hmap.put(splited[0], splited[1]);		   
					   }
				
				// Start of Simple Expression
					   else if (mapStart && ComplexExpr && token.getText().equals(";") && token.getType() == 14) {
						   SimpleExpr = true;
					
					   }
					   else if (mapStart && ComplexExpr  && hmap.containsKey(token.getText()) && !ifstmt)
						   output = output + "\"" + hmap.get(token.getText())+ " as _1\",";
				
					   else if (mapStart && ComplexExpr  && token.getText().equals("if")) {
						   ifstmt = true;
					   }
				
					  
				
					   else if(mapStart && ComplexExpr  && ifstmt && token.getType() == 12 ) {
						   
						   String comp = token.getText();
						   it = hmap.entrySet().iterator();
						   while (it.hasNext()) {
							Map.Entry pair = (Map.Entry)it.next();
						   comp = comp.replaceAll(pair.getKey().toString(),pair.getValue().toString());
						   }
						   output = output + "\"if(" + comp;
					   }
					
					   else if(mapStart && ComplexExpr  && ifstmt && token.getType() == 5 && !(token.getText().equals("else") || token.getText().equals(".collect")) ) {
						  
						   String expr = token.getText();
						    it = hmap.entrySet().iterator();
						   while (it.hasNext()) {
								Map.Entry pair = (Map.Entry)it.next();
							   expr = expr.replaceAll(pair.getKey().toString(),pair.getValue().toString());
							   }
						   output = output + "," + expr;
						   count++;
						   if(count == 2)
							   output = output + ") as _2\")";
					   }
						//UDF
					   else if (token.getType() == 4) {
						   
						   String[] part = token.getText().split("=>");
						   String Operand = part[1];
						   Operand = Operand.replaceAll("[-+*%/]", "~") ;
						   String[] var = Operand.split("~");
						   output = output + "\"";
						    
						   for(int i=0;i<var.length;i++) {
							   String[] ex = var[i].split("._");
							   part[1] = part[1].replaceAll(var[i] , "_"+ex[1]);
						   }
							
						  
						   output = output + part[1] + " as _1";
						   output = output + "\")";
					   }
					   else if(token.getText().equals(".collect") ) {
						   output = output + ".collect()";
					   }
				   
				 //  	System.out.println(token.getType() + token.getText());
			   }
			
		
			 
				TokenStream tokenStream = new CommonTokenStream(lexer);
				gramParser parser = new gramParser(tokenStream);
			parser.prog();
			
			if(parser.getNumberOfSyntaxErrors() == 0) {
				System.out.println(output);
				 try (PrintWriter out = new PrintWriter("output//output.txt")) {
			    	    out.println(output);
			    	    System.out.println("Successfully Converted the Input!!");
			    	}
			      catch ( IOException e)
			      {
			    	  System.out.println("Unable to Write");
			      }
			}
			else {
				System.out.println("Unable to convert!!!\nInput does not match the Grammer");
			}
				
		
			}
			catch(Exception e) {
				return false;
			}
		return false;
	}

	
}
