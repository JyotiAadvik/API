package jira;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class JiraCreate extends JiraBaseclass {
	
	
	@Test
	public void create() {
		//end point
		
		 input = RestAssured.given()
				.contentType("application/json")
				.when().body("{\r\n"
						+ "    \"fields\": {\r\n"
						+ "    \"project\":\r\n"
						+ "                {\r\n"
						+ "                    \"key\": \"TEST-1\"\r\n"
						+ "                },\r\n"
						+ "    \"summary\": \"create issue in RA project\",\r\n"
						+ "    \"description\": \"Creating of an issue using project keys and issue type names using the REST API\",\r\n"
						+ "    \"issuetype\": {\r\n"
						+ "                    \"name\": \"Bug\"\r\n"
						+ "                }\r\n"
						+ "    }\r\n"
						+ "}\r\n"
						+ "\r\n"
						);
		Response response = input.post();
		response.prettyPrint();
		
		
		//String sys_id = response.jsonPath().get("result.sys_id");
		//System.out.println("the extracted sys_id is -------"+sys_id);
		int statusCode = response.getStatusCode();
		
		
		System.out.println("my status code is"+statusCode);
		
	}

}


