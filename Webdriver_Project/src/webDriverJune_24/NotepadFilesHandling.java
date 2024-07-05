package webDriverJune_24;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class NotepadFilesHandling {

	public static void main(String[] args) throws Throwable {
		FileReader fr = new FileReader("D:/Practice Script.txt");
		BufferedReader br = new BufferedReader(fr);
		String str;
		while ((str=br.readLine())!=null) 
		{
			Thread.sleep(500);
			System.out.println(str);
		}
		
		br.close();

	}

}
