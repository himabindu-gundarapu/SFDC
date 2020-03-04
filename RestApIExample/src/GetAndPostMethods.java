

import java.util.HashMap;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetAndPostMethods extends ReusableMethods{
	static Response res = RestAssured.given().body("{\"username\": \"himabindu@ta.com\", \n" + 
			"\"password\": \"himabindu\"}").contentType("application/json").post();
	static String s1 = res.jsonPath().getString("token").toString();

	public static void main(String[] args) {
		getMethod();
		//Assert.assertEquals(res.getStatusCode(), 201);
	}
	public static void postMethod() {
		String sUrl = "https://us-central1-qa01-tekarch-accmanager.cloudfunctions.net/login";
		RestAssured.baseURI = sUrl;
		
		System.out.println(res.asString());
		System.out.println(res.statusCode());
		int code = res.getStatusCode();
		if( code == 201) {
			System.out.println("status code is correct. Test case is passed");
		}
		else {
			System.out.println("status code is wrong . Test case failed");
		}
	}
	public static void getMethod() {
		
			String getUrl ="https://us-central1-qa01-tekarch-accmanager.cloudfunctions.net/getdata";
			RestAssured.baseURI = getUrl;
			HashMap<String ,String> map = new HashMap<>();
			s1 =s1.replace("[", "").replace("]", "");
			System.out.println(s1);
			map.put("token",s1);
			Response resGet = RestAssured.given().contentType("application/json").when().headers(map).get();
			System.out.println(resGet.asString());
	}
}
