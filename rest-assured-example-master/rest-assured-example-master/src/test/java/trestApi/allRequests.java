package trestApi;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class allRequests {
	
	@Test
	public void test_01() { 
		Response respons = RestAssured.get("https://jsonplaceholder.typicode.com/posts/");
		
		System.out.println(respons.asString());
		System.out.println(respons.getBody().asString());
	}

}
