package com.inetbanking.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver ldriver;

	 public LoginPage(WebDriver rdriver) 
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(name="uid")
	WebElement UserName;

	@FindBy(name="password")
	WebElement Password;

	@FindBy(name="btnLogin")
	WebElement LoginButton;
	
	@FindBy (xpath="//a[@href='Logout.php']")
	WebElement LogoutButton;

	public void User_Name(String uname) {

		UserName.sendKeys(uname);

	}

	public void Pass_word(String pwd) {

		Password.sendKeys(pwd);

	}
	
	public void Login_Button() {

		LoginButton.click();

	}
	
	public void Logout_Button() {
		LogoutButton.click();
	}










}
