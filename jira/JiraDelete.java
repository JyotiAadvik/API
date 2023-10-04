package jira;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class JiraDelete extends JiraBaseclass {
	@Test (dependsOnMethods = "jira.JiraUpdate.update")
	public void delete() {
		//end point
	
		
		
		RequestSpecification input = RestAssured.given()
				.contentType("application/json")
				.when().body("");
		
		
		Response response = input.delete("/");
		response.prettyPrint();
		
		 int statusCode = response.getStatusCode();
			
			
			System.out.println("my status code is"+statusCode);
		
		
		 //response.then().assertThat().statusCode(Matchers.equalTo(204));
		
	}
}
