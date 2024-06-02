package com.inetbanking.TestCases;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.PageObjects.LoginPage;
import com.inetbanking.PageObjects.NewCustomer;

public class TC_AddCustomerTest_003 extends BaseClass {
	
	@Test
	public void addnewcustomer() throws InterruptedException, IOException 
	{
		System.out.println("the code update by me");
		LoginPage lp = new LoginPage(driver);
		lp.User_Name(UserName);
		logger.info("Username is provided");
		lp.Pass_word(Password);
		logger.info("Password is provided");
		lp.Login_Button();
		Thread.sleep(3000);
		
		NewCustomer nc = new NewCustomer(driver);
		nc.Click_New_Customer();
		logger.info("Provided Customer details....");
		nc.Customer_Name("Abhijeet");
		nc.Dob("1", "3", "1994");
		Thread.sleep(3000);
		nc.address("Hinjewadi phase 1");
		nc.city("Pune");
		nc.state("Maharashtra");
		nc.pin("444606");
		nc.Telephone_Number("8149365729");
		String email=randomestring()+"@gmail.com";
		nc.E_Mail(email);
		nc.Pass_Word("Abhijeet@123");
		nc.Click_Submit();
		
		Thread.sleep(3000 );
		
		logger.info("Valided started....");
		
		boolean res=driver.getPageSource().contains("Customer Registered Successfully!!!");
		
		if(res==true)
		{
			Assert.assertTrue(true);
			logger.info("test cases pass....");
		}
		else 
		{
			captureScreen(driver,"addnewcustomer");
			Assert.assertTrue(false);
			logger.info("test cases fail....");
		}
		
	}

}
