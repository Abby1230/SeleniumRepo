package com.inetbanking.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewAccount {
	
	WebDriver ldriver;

	public NewAccount(WebDriver rdriver) 
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy (xpath="//a[@href='addAccount.php']")
	WebElement NewAccountClick;

	@FindBy (name="cusid")
	WebElement CustomerId;
	
	@FindBy (name="inideposit")
	WebElement InitialDeposit;

    @FindBy (name="button2")
	WebElement DepositButton;
    
    public void New_Account_Click() {
    	NewAccountClick.click();
    }
    
    public void Customer_Id(String id) {
    	CustomerId.sendKeys(id);
    }
    
    public void Initial_Deposit(String id) {
    	InitialDeposit.sendKeys(id);
    }
    
    public void Deposi_tButton() {
    	DepositButton.click();
    }
    
    
	
	

}
