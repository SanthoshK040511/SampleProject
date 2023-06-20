package org.stepdefinition;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PositiveandNegativeofFb extends BaseClass{
	@Given("To Launch the chrome browser and maxmize window")
	public void to_Launch_the_chrome_browser_and_maxmize_window() {
		launchBrowser();
		windowMaxmize();
	    
	}

	@When("To launch the Url of facebook application")
	public void to_launch_the_Url_of_facebook_application() {
		launchUrl("https://www.facebook.com/");
	   
	}

	@When("To Pass valid username in email field")
	public void to_Pass_valid_username_in_email_field() {
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("santhosh@gmail.com");
	   
	}

	@When("To Pass invalid password in password field")
	public void to_Pass_invalid_password_in_password_field() {
		WebElement pwd = driver.findElement(By.name("pass"));
		pwd.sendKeys("Santhoshkumar");
	   
	}

	@When("To click the login button")
	public void to_click_the_login_button() {
		WebElement lgn = driver.findElement(By.name("login"));
		lgn.click();
	   
	}

	@When("To check whether navigate to homepage or not")
	public void to_check_whether_navigate_to_homepage_or_not() {
		System.out.println("Please Check Your Credentials");
	    
	}

	@Then("To Close the browser")
	public void to_Close_the_browser() {
		closeEntireBrowser();
	    
	}


}
