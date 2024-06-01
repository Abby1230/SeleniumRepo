package com.inetbanking.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditCustomer {

	WebDriver ldriver;

	public EditCustomer(WebDriver rdriver) 
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy (xpath="//a[@href='EditCustomer.php']")
	WebElement EditCustomerClick;

	@FindBy (name="cusid")
	WebElement CustomerUserId;

	@FindBy (name="AccSubmit")
	WebElement SubmitButtonClick;

	@FindBy (name="city")
	WebElement City;

	//sub
	@FindBy (name="sub")
	WebElement SubmiButton;

	public void Edit_Customer_Click() {

		EditCustomerClick.click();
	}

	public void Customer_UserId(String Ci) {

		CustomerUserId.sendKeys(Ci);
	}
	
	public void Submit_Button_Click() {

		SubmitButtonClick.click();
	}
	
	public void City_Name(String name) {

		City.sendKeys(name);
	}
	
	public void Submi_Button() {

		SubmiButton.click();
	}
	
	






}
