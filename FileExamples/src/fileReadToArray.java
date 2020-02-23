import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class fileReadToArray {
	static String line;
	static String path ="/Users/sayanna/eclipse-workspace/FileExamples/test.text";

	public static void main(String[] args) {
		ArrayList<String> strArr = new ArrayList<>();
	

		
		try {
			FileReader fRead = new FileReader(path);
			BufferedReader br = new BufferedReader(fRead);
			while((line = br.readLine())!=null) {
				
				strArr.add(line); 
			
			}
			System.out.println(strArr + "\n");
			br.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
