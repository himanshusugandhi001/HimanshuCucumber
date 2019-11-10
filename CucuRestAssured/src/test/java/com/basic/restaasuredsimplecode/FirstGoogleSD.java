package com.basic.restaasuredsimplecode;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;


public class FirstGoogleSD {
	Response res;
	
	@Given("^I start rest aasured testing$")
	public void i_start_rest_aasured_testing()  {
		System.out.println("Starting of RestAssured");
	   
	}

	@When("^I hit the Google Website$")
	public void i_hit_the_Google_Website()  {
		res = RestAssured.given().get("https://www.google.com/");
	   
	}

	@Then("^I check the status code from respone$")
	public void i_check_the_status_code_from_respone() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    int stcode = res.getStatusCode();
	    Assert.assertTrue(stcode==200);
	}

	

}
