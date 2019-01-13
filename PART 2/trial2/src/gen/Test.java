import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;

public class Test {

	public static void main(String[] args)  {
		
	
		
		FileReader fileReader;
		try {
			
			fileReader = new FileReader(new File("input/inp.txt"));
			BufferedReader bufferedReader = new BufferedReader(fileReader); 	
			StringBuffer stringBuffer = new StringBuffer();
			String line;
			line = bufferedReader.readLine();
			GrammerValidator validator = new GrammerValidator();
			
			validator.validate(line);
				
			
			
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
