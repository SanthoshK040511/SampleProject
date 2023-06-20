package org.stepdefinition;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class fblogin extends BaseClass {
	
	
	@Given("User has to launch the browser and maximize the window")
	public void user_has_to_launch_the_browser_and_maximize_the_window() {
		launchBrowser();
		windowMaxmize();
	    
	}

	@When("User has to hit the Facebook Url")
	public void user_has_to_hit_the_Facebook_Url() {
		launchUrl("https://www.facebook.com/");
	    
	}

	@When("User has to pass the data {string} in email field")
	public void user_has_to_pass_the_data_in_email_field(String em) {
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys(em);
	    
	}

	@When("user has to pass the data {string}in password field")
	public void user_has_to_pass_the_data_in_password_field(String password) {
		WebElement pwd = driver.findElement(By.name("pass"));
		pwd.sendKeys(password);
	   
	}

	@When("User has to click the login button")
	public void user_has_to_click_the_login_button() {
		WebElement btn = driver.findElement(By.name("login"));
		btn.click();
	   
	}

	@Then("User has to close the browser")
	public void user_has_to_close_the_browser() {
		closeEntireBrowser();
	   
	}
}
