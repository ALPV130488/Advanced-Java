package filehandling;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderEx {
	
	public static void main(String[] args) throws IOException {
		
//		FileWriter fw = new FileWriter("C:\\Users\\PRADEEP GOUD\\Desktop\\newfile3.txt");
		
		FileReader fr = new FileReader("C:\\Users\\PRADEEP GOUD\\Desktop\\DailyNotes.txt");
		
		int i = fr.read();
		
		while(i != -1)
		{
			
			i=fr.read();
			
		}
		
		System.out.println("File is read successfully");
		
	}

}
