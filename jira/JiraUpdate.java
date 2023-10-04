package jira;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class JiraUpdate {
	@Test (dependsOnMethods = "jira.JiraCreate.create")
	public void update() {
		//end point
	
		
		
		RequestSpecification input = RestAssured.given()
				.contentType("application/json")
				.when().body("{\r\n"
						+ "    \"fields\": {\r\n"
						+ "\r\n"
						+ "        \"description\": \"Bug creation Using REST API for testing\"\r\n"
						+ "    }\r\n"
						+ "}\r\n"
						);
		
		
		Response response = input.put("/");
		response.prettyPrint();
        int statusCode = response.getStatusCode();
		
		
		System.out.println("my status code is"+statusCode);
		
		
	}

}
