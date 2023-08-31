package filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {
	
	public static void main(String[] args) throws IOException {
		
		FileWriter fw = new FileWriter("C:\\Users\\PRADEEP GOUD\\Desktop\\newfile.txt");
		
		fw.write(97);
		
		fw.write(1234);
		
		fw.write("good /n morning");
		
		char[] ch = {'a','b','c','d'};
		
		fw.write(ch);
		
		System.out.println("file created and written successfully");
		
		fw.flush();//pushes the remaining data into the file
		
		fw.close();
		
		
	}
//it's not accepting numerical values
//it's not taking new line to print
}
