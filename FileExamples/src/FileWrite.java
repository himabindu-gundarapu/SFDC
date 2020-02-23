import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {

	public static void main(String[] args){
		String filepath ="/Users/sayanna/eclipse-workspace/FileExamples/writetest.text";
		try {
			FileWriter fWrite = new FileWriter(filepath);
			BufferedWriter bWrite = new BufferedWriter(fWrite);
			bWrite.write("Hi, Howare you?");
			bWrite.newLine();
			bWrite.write("How was your day?");
			
			bWrite.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
