package jira;

import org.testng.annotations.BeforeMethod;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class JiraBaseclass {
	
	
	public static String sys_ID;
	public RequestSpecification input;
	public static Response response;
	
    @BeforeMethod
	public void setup() {
		//end point
    	RestAssured.baseURI="https://aadvikjira.atlassian.net/";
		RestAssured.authentication=RestAssured.preemptive().basic("jyoticha30@gmail.com", "ATATT3xFfGF0-rP1BgB9Kkw9L6rrLY22juQl8kJ1kN2XLiaoDauWE8C0ygK2H5SUAv46VZ8rN8q-caut_yGj_Mt4OOhUwuvvf6T-79BhsdKgnV0J7t6t8DnVkPCPCcj9EBPgMYwSEAszK3-Hg1pV3UXJmHjw06lsyaY7WDx2BrdN3iYIFCek5rs=BB3A2C00");

}
}
