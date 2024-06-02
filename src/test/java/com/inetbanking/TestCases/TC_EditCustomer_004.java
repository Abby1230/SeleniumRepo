package com.inetbanking.TestCases;

import com.inetbanking.PageObjects.LoginPage;

import org.testng.annotations.Test;

import com.inetbanking.PageObjects.EditCustomer;

public class TC_EditCustomer_004 extends BaseClass {
	@Test
	public void EditCustomer () throws InterruptedException {
		
		system.out.println("Shruti is updated");
		LoginPage lp = new LoginPage(driver);
		lp.User_Name(UserName);
		logger.info("Username is provided");
		lp.Pass_word(Password);
		logger.info("Password is provided");
		lp.Login_Button();
		Thread.sleep(3000);
		
		EditCustomer ec = new EditCustomer(driver);
		ec.Edit_Customer_Click();
		ec.Customer_UserId("62437");
		ec.Submit_Button_Click();
		ec.City_Name("Nagpur");
		ec.Submi_Button();
		Thread.sleep(3000);
		
		
	}

}
