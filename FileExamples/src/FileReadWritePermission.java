import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReadWritePermission {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File myFile = new File("/Users/sayanna/eclipse-workspace/FileExamples/test.text");
		String line;
		
		if(myFile.canRead()) {
			
				
				try {
					FileReader fr = new FileReader(myFile);
					BufferedReader br = new BufferedReader(fr);
					//line = br.readLine();
					while( (line = br.readLine())!=null)
					{
					System.out.println(line);
					}
					br.close();
					
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
			
			
		}
		else
		{
			System.out.println("file cant read");
		}
		if(myFile.canWrite()) {
			System.out.println("file can write");
		}
		else {
			System.out.println("file can't write");
		}

	}

}
