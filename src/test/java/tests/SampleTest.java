package tests;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class SampleTest {

	@Test	
	public void sampleTestMethod() {
		
		Response response = RestAssured.get("https://reqres.in/api/users?page=2");
		int actualStatusCode = response.getStatusCode();
		
		System.out.println(actualStatusCode);
		System.out.println(response.getSessionId());
		System.out.println(response.getTime());
		System.out.println(response.getTimeIn(TimeUnit.SECONDS));
		System.out.println(response.getBody().asString());
		System.out.println(response.getStatusLine());
		System.out.println(response.getHeader("content-type"));
		
		
		
		Assert.assertEquals(actualStatusCode, 201);
	}
}
