package Property_fileRead;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadExample {

	public static void main(String[] args) {
		String propertiesFilePath = "/Users/sayanna/eclipse-workspace/PropertyfileExample/data.properties";
		FileInputStream fileIn;
		try {
			fileIn = new FileInputStream(propertiesFilePath);
			Properties props = new Properties();
			props.load(fileIn);
			System.getProperties().putAll(props);
			System.out.println(System.getProperty("Password"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
