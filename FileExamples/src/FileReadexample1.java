
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

import java.io.IOException;

public class FileReadexample1 {

	public static void main(String[] args) {
		String filepath = "/Users/sayanna/eclipse-workspace/FileExamples/test.text";
		String line;

		try {
			FileReader fRead = new FileReader(filepath);
			BufferedReader bRead = new BufferedReader(fRead);
			try {
				while ((line = bRead.readLine()) != null) {
					System.out.println(line);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
