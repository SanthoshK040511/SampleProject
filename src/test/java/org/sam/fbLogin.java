package org.sam;


import java.sql.Driver;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class fbLogin extends BaseClass {
	
	public fbLogin() {
		PageFactory.initElements(driver, email);
	}
	@FindBy(id="email")
	private WebElement email;
	
	@FindBy(name = "pass")
	private WebElement password;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement Submit;

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getSubmit() {
		return Submit;
	}
	
	
}
