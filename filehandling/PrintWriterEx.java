package filehandling;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterEx {
	
	public static void main(String[] args) throws IOException {
		
		FileWriter fw = new FileWriter("C:\\Users\\PRADEEP GOUD\\Desktop\\newfile3.txt");
		
		PrintWriter pw = new PrintWriter(fw);
		
		pw.println(97);
		
		pw.println(1234);
		
		pw.println("good Morning");
		
		char []ch = {'a','b','c','d'};
		
		pw.println(ch);
		
		System.out.println("file is written successfully");
		
		pw.flush();
		
		pw.close();
		
	}

}
