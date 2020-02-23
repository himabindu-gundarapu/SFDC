import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class AppendText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path ="/Users/sayanna/eclipse-workspace/FileExamples/test.text";
		String str = "Are you going to office today?";
		try {
			FileWriter fw = new FileWriter(path,true);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(str);
			bw.write("no, am not going today.");
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
