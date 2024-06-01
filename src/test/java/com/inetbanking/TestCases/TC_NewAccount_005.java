package com.inetbanking.TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.PageObjects.LoginPage;
import com.inetbanking.PageObjects.NewAccount;

public class TC_NewAccount_005 extends BaseClass {
	@Test
	public void NewAccount() throws InterruptedException 
	{
		LoginPage lp = new LoginPage(driver);
		lp.User_Name(UserName);
		logger.info("Username is provided");
		lp.Pass_word(Password);
		logger.info("Password is provided");
		lp.Login_Button();
		Thread.sleep(3000);
		
		NewAccount na = new NewAccount(driver);
		na.New_Account_Click();
		na.Customer_Id("62437");
		na.Initial_Deposit("400000");
		na.Deposi_tButton();
		Thread.sleep(3000);
		
boolean res=driver.getPageSource().contains("Account Generated Successfully!!!");
		
		if(res==true)
		{
			Assert.assertTrue(true);
			logger.info("test cases pass....");
		}
		else 
		{
			//captureScreen(driver,"NewAccount");
			Assert.assertTrue(false);
			logger.info("test cases fail....");
		}
		
	}

}
