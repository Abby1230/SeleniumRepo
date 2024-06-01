package com.inetbanking.TestCases;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.openqa.selenium.*;

import com.inetbanking.Utilities.ReadConfig;



public class BaseClass {
	
	ReadConfig readConfig = new ReadConfig();

	public String BaseUrl = readConfig.GetApplicationUrl();
	
	public String UserName = readConfig.GetUser();
	
	public String Password = readConfig.GetPassword();
	
	public static WebDriver driver;
	
	public static Logger logger;

	@Parameters("Browser")
	@BeforeClass
	public void SetUp(String br) 
	{
		//Open Browser
		
		logger = Logger.getLogger("EBanking");
		
		PropertyConfigurator.configure("Log4j.properties");
		
		if (br.equals("Chrome"))
		{
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+readConfig.Chrome());
		driver = new ChromeDriver();
		}
		
		else if (br.equals("Firefox"))
		{
			System.setProperty("webdriver.geco.driver",System.getProperty("user.dir")+readConfig.firefox());
			driver = new FirefoxDriver();
		}
		
		else if (br.equals("IE"))
		{
			System.setProperty("webdriver.ie.driver",System.getProperty("user.dir")+readConfig.InternetExplorer());
			driver = new InternetExplorerDriver();
		}
		
		driver.get(BaseUrl);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		
	}
	@AfterClass
	public void teardown() 
	{
		driver.quit();
	}
	
	public void captureScreen(WebDriver driver, String tname) throws IOException 
	
	{
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir")+ "/Screenshots"+tname+".png");
		FileUtils.copyFile(source, target);
		System.out.println("Screenshots taken");
	}
	
	public String randomestring() {
		String generatedstring = RandomStringUtils.randomAlphabetic(8);
		return(generatedstring);
		
	}
	
	public String randomeNum() {
		String generatedstring2 = RandomStringUtils.randomNumeric(4);
		return(generatedstring2);
		
	}



}
