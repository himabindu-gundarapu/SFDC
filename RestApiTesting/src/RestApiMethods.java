import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RestApiMethods extends ReusableMethods {

	String token;
	static final int kRespCodeOK = 200;
	static final int kRespCodeCreated = 201;

	@BeforeTest
	public void logIn() {
		Response resp = getLoginResponse();
		Assert.assertEquals(resp.getStatusCode(), kRespCodeCreated);
		String s1 = resp.jsonPath().getString("token");
		Assert.assertTrue(!s1.contains(" "));
		token = s1.replace("[", "").replace("]", "");

	}

	@Test
	public void getData() {
		Response resp = getDataResponse(token);
		Assert.assertEquals(resp.getStatusCode(), kRespCodeOK);
		System.out.println(resp.asString());
		System.out.println(resp.jsonPath().getString("data.accountno"));
		List<Map<String,String>> x = resp.jsonPath().getList("data.accountno");
		System.out.println(x.get(0));
		System.out.println();
	}
	
	@Test
	public void testAddUser() {
		RestAssured.baseURI = "https://us-central1-qa01-tekarch-accmanager.cloudfunctions.net/addData";
		HashMap<String, String> map = new HashMap<>();
		map.put("token", token);
		String accountNum = "90909090";
		String depNum = "5";
		String body = "{\"accountno\": \"" + accountNum + "\", \"departmentno\": \"" + depNum + "\", \"salary\": \"5678\", \"pincode\": \"345678\"}";
		Response resp = RestAssured.given().body(body).contentType("application/json").when().headers(map).post();
		System.out.println(resp.statusCode());
		Response getDataResp = getDataResponse(token);
		System.out.println(getDataResp.asString());
		System.out.println(getDataResp.jsonPath().getString("data.departmentno"));
		Assert.assertTrue(getDataResp.jsonPath().getString("data.departmentno").contains(depNum));
//		List<map<String,String> accountNum = getDataResp.jsonPath().getList("data.accountno");
		//Assert.assertTrue(getDataResp.jsonPath().getString("accountno").contains("71717171"));
		//System.out.println(resp.jsonPath().getString("token"));
		//System.out.println(getDataResp.jsonPath().getString("accountno"));
	}
	@Test
	public void upDateUser() {
		RestAssured.baseURI = "https://us-central1-qa01-tekarch-accmanager.cloudfunctions.net/updateData";
		HashMap<String, String> map = new HashMap<>();
		System.out.println(token);
		map.put("token", token);
		System.out.println(map);
		Response updateResp = RestAssured.given().body("{\"accountno\": \"71717170\", \"departmentno\": \"4\", \"salary\": \"5678\", \"pincode\":\"345678\", \"userid\": \"nUf87k2SXNyiDE32Mghy\",\"id\": \"rBsv5yqYi3woT9c2wsN4\"}").contentType("application/json").when().headers(map).put();
		int code =updateResp.statusCode();
		Assert.assertEquals(code,kRespCodeOK,"Satuscode wrong");
		Response getDataResp = getDataResponse(token);
		String updatedAccountNum = "71717170";
		Assert.assertTrue(getDataResp.jsonPath().getString("data.accountno").contains(updatedAccountNum),"Account number not updated");
		System.out.println("updated account number is :" +updatedAccountNum );
		
	}
	@Test
	public void deleteUser() {
		RestAssured.baseURI = "https://us-central1-qa01-tekarch-accmanager.cloudfunctions.net/deleteData";
		HashMap<String, String> map = new HashMap<>();
		//System.out.println(token);
		map.put("token", token);
		Response deleteResp = RestAssured.given().body("{\"id\": \"MCFflSEkO4VcE3Q4pw8Y\", \"userid\": \"nUf87k2SXNyiDE32Mghy\"}").contentType("application/json").when().headers(map).delete();
		int code = deleteResp.statusCode();
		Assert.assertEquals(code, 200);
		Response getDataResp = getDataResponse(token);
		String accountNum = "90909090";
		Assert.assertTrue(!getDataResp.jsonPath().getString("data.accountno").contains(accountNum));
		System.out.println("Account number deleted");
		
		
		
	}
}
