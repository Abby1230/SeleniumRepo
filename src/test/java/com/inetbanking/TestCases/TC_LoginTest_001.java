package com.inetbanking.TestCases;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.*;

import com.inetbanking.PageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass {
	
	@Test
	public void loginTest() throws IOException 
	{
		LoginPage lp = new LoginPage(driver);
		
		lp.User_Name(UserName);
		logger.info("Enter UserName");
		
		lp.Pass_word(Password);
		logger.info("Enter PassWord");
		
		lp.Login_Button();
		logger.info("Click The Login Button");
		
		if (driver.getTitle().equals("Guru99 Bank Manager HomePage"))
		{
			Assert.assertTrue(true);
			logger.info("Login Test Pass");
		}
		
		else
		{
			captureScreen(driver,"loginTest");
			Assert.assertTrue(false);
			logger.info("Login Test Failed");
		}
		
		
		
	}

}
