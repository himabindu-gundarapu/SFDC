import java.util.HashMap;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class ReusableMethods {

	public Response getLoginResponse() {
		String sUrl = "https://us-central1-qa01-tekarch-accmanager.cloudfunctions.net/login";
		RestAssured.baseURI = sUrl;
		Response res = RestAssured.given()
				.body("{\"username\": \"himabindu@ta.com\", \n" + "\"password\": \"himabindu\"}")
				.contentType("application/json").post();
		return res;
	}

	public Response getDataResponse(String token) {
		RestAssured.baseURI = "https://us-central1-qa01-tekarch-accmanager.cloudfunctions.net/getdata";

		HashMap<String, String> map = new HashMap<>();
		map.put("token", token);

		return RestAssured.given().contentType("application/json").when().headers(map).get();
	}
}
