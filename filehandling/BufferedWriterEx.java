package filehandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterEx {

	public static void main(String[] args) throws IOException {

		FileWriter fw = new FileWriter("C:\\Users\\PRADEEP GOUD\\Desktop\\newfile2.txt");

		BufferedWriter bw = new BufferedWriter(fw);

		bw.write(97);
		
		bw.newLine();

		bw.write(1234);
		
		bw.newLine();

		bw.write("good /n morning");
		
		bw.newLine();

		char[] ch = { 'a', 'b', 'c', 'd' };

		bw.write(ch);

		System.out.println("file created and written successfully");
		
		bw.flush();
		
		bw.close();

	}
	
	//it's not accepting numerical values

}
