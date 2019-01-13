import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

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
			String temp = null;
			String output = "";
			CharStream charStream = new ANTLRInputStream(line);;
			gramLexer lexer = new gramLexer(charStream);

			 List<? extends Token> tokenList = new ArrayList<>();
			
			   tokenList = lexer.getAllTokens();
			  
			    for(Token token : tokenList) {
			    	
			    	if(token.getType() == 12 || token.getType() == 11 || token.getType() == 13 )
			    		temp = token.getText();
			    	
			    	else if(token.getType() == 17 && temp != null) {
			    		
			    		if(temp.equals(".reduce"))
			    			output = output + ".select(reduceAggregator" + token.getText() + ")" + ".collect()";
			    		
			    		if(temp.equals(".reduceByKey"))
			    			output = output + ".groupByKey(_._1).agg(reduceByKeyAggregator" + token.getText() + ")";
			    		
			    		if(temp.equals(".sortBy"))
			    			output = output + ".map(row=>(" + token.getText() + "(row), row)).orderBy(\"_1\").map(_._2)";
			    		temp=null;
			    	}
			    	else if(token.getType() == 2) {
			    		output = output + "spark";
			    	}
			    	else if(token.getType() == 7) {
			    		output = output + ".read.textFile(";	
			    	}
			    	else
			    		output = output + token.getText();
			    	
			    }
			      
			
			    CharStream charStream1 = new ANTLRInputStream(line);;
			 gramLexer lexer1 = new gramLexer(charStream1);
			TokenStream tokenStream = new CommonTokenStream(lexer1);
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
