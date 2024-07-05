package webDriverJune_24;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class NewFileCreation {

	public static void main(String[] args) throws Throwable {
		File f = new File("D:/Sample.txt");
		FileWriter fw = new FileWriter(f);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("iam learning java");
		bw.newLine();
		bw.write("iam learning selenium");
		bw.newLine();
		bw.write("iam learning manual");
		bw.flush();
		bw.close();

	}

}
