package com.inetbanking.TestCases;

import java.io.IOException;

import org.openqa.selenium.NoAlertPresentException;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.inetbanking.PageObjects.LoginPage;
import com.inetbanking.Utilities.XLUtils;

public class TC_LoginDDT_002 extends BaseClass
{
   @Test(dataProvider="LoginData")
   public void loginDDT(String uname, String pwd) throws InterruptedException 
   {
	   LoginPage lp = new LoginPage(driver);
	   lp.User_Name(uname);
	   logger.info("user name provider");
	   lp.Pass_word(pwd);
	   logger.info("password provider");
	   lp.Login_Button();
	   Thread.sleep(3000);
	   
	   if(isAlertPresent()==true)
	   {
		   driver.switchTo().alert().accept(); //close alert
		   driver.switchTo().defaultContent(); //main page
		   Assert.assertTrue(false);
		   logger.warn("Login failed");
	   }
	   
	   else 
	   {
		   Assert.assertTrue(true);
		   logger.warn("Login passed");
		   lp.Logout_Button();
		   Thread.sleep(3000);
		   driver.switchTo().alert().accept();//close logout alert
		   driver.switchTo().defaultContent(); //main page
		}
   }
   
   public boolean isAlertPresent() // user defined method created to check alert is present or not
   {
	   try
	   {
		   driver.switchTo().alert();
		   return true;
	   }
	   catch(NoAlertPresentException e)
	   {
		   return false;
	   }
   }
   
	
@DataProvider(name="LoginData")
String [][] getData () throws IOException
{
	String path = System.getProperty("user.dir")+"/src/test/java/com/inetbanking/TestData/LoginData.xlsx";
	//String path ="D:\\WorkSpace\\InetBankingV1\\src\\test\\java\\com\\inetbanking\\TestData\\LoginData.xlsx";
	//String path = "C://Users/LoginData.xlsx";
	
	int rownum = XLUtils.getRowCount(path, "Sheet1");
	int colcount = XLUtils.getCellCount(path, "Sheet2",1);
	
	String logindata [][] = new String [rownum][colcount];
	
	for (int i=1;i<=rownum;i++) 
	{
		for(int j=0;j<colcount;j++)
		{
			logindata [i+1][j] = XLUtils.getCellData(path, "Sheet1", i, j);
		}
	}
	
	return logindata;
	
}
}