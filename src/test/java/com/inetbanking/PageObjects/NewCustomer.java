package com.inetbanking.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewCustomer {
	
	WebDriver ldriver;

	 public NewCustomer(WebDriver rdriver) 
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	 
	 @FindBy(xpath="//a[@href='addcustomerpage.php']")
	 WebElement Click_NewCustomer;
	 
	 @FindBy(name="name")
	 WebElement CustomerName;
	 
	 @FindBy(name="rad1")
	 WebElement Gender;
	 
	 @FindBy(name="dob")
	 WebElement DateOfBirth;
	 
	 @FindBy(name="addr")
	 WebElement Address;
	 
	 @FindBy(name="city")
	 WebElement City;
	 
	 @FindBy(name="state")
	 WebElement State;
	 
	 @FindBy(name="pinno")
	 WebElement PIN;
	 
	 @FindBy(name="telephoneno")
	 WebElement TelephoneNumber;
	 
	 @FindBy(name="emailid")
	 WebElement EMail;
	 
	 @FindBy(name="password")
	 WebElement Password;
	 
	 @FindBy(name="sub")
	 WebElement ClickSubmit;
	 
	 public void Click_New_Customer () {
		 Click_NewCustomer.click();
	 }
	 
	 public void Customer_Name (String Uname) {
		 CustomerName.sendKeys(Uname);
	 }
	 
	 public void gender () {
		 Gender.click();
	 }
	 
	 public void Dob (String mm, String dd, String yy) {
		 DateOfBirth.sendKeys(mm);
		 DateOfBirth.sendKeys(dd);
		 DateOfBirth.sendKeys(yy);
	}
	 
	 public void address (String ad) {
		 Address.sendKeys(ad);
	 }
	 
	 public void city (String cy) {
		 City.sendKeys(cy);
	 }
	 
	 public void state (String st) {
		 State.sendKeys(st);
	 }
	 
	 public void pin (String pn) {
		 PIN.sendKeys(String.valueOf(pn));
	 }
	 
	 public void Telephone_Number (String tl) {
		 TelephoneNumber.sendKeys(tl);
	 }
	 
	 public void E_Mail (String em) {
		 EMail.sendKeys(em);
	 }
	 
	 public void Pass_Word (String pw) {
		 Password.sendKeys(pw);
	 }
	 
	 public void Click_Submit () {
		 ClickSubmit.click();
	 }

	
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 

}
