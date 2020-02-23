import java.text.SimpleDateFormat;
import java.util.Date;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class Entry {
	static ExtentTest logger;
	static ExtentReports report;
	static String fileName = new SimpleDateFormat("'SFDCReport_'YYYYMMddHHmm'.html'").format(new Date());
	static String path = "/Users/sayanna/eclipse-workspace/SFDC37/Report/"+ fileName;
	
	public static void CreateReport() {
		
		report = new ExtentReports(path);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreateReport();
		System.out.println(path);
	}

}
