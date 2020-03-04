import io.restassured.RestAssured;
import io.restassured.response.Response;

public class ReusableMethods {
public static Response getResponse() {
	String sUrl = "https://us-central1-qa01-tekarch-accmanager.cloudfunctions.net/login";
	RestAssured.baseURI = sUrl;
	Response res = RestAssured.given().body("{\"username\": \"himabindu@ta.com\", \n" + 
			"\"password\": \"himabindu\"}").contentType("application/json").post();
	return res;
	
//	System.out.println(res.asString());
//	System.out.println(res.statusCode());
//	int code = res.getStatusCode();
//	if( code == 201) {
//		System.out.println("status code is correct. Test case is passed");
//	}
//	else {
//		System.out.println("status code is wrong . Test case failed");
//	}
}

}
