package com.inetbanking.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	
	Properties pro;
	
	public ReadConfig() {
		File src = new File("./Configuration/Config.properties");
		try {
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
		} 
		
		catch(Exception e) 
		{
			System.out.println("Exceptio is "+e.getMessage());
		}
	}
	
	public String GetApplicationUrl() {
		String url =pro.getProperty("BaseUrl");
		return url;
		
	}
	
	public String GetUser() {
		String usr =pro.getProperty("UserName");
		return usr;
		
	}
	
	public String GetPassword() {
		String pas =pro.getProperty("Password");
		return pas;
		
	}
	
	public String Chrome() {
		String chr =pro.getProperty("chropath");
		return chr;
		
	}
	
	public String firefox() {
		String fir =pro.getProperty("firefox");
		return fir;
		
	}
	
	public String InternetExplorer() {
		String IE =pro.getProperty("iepath");
		return IE;
		
	}
	
	
	
	
	
	
	
	
	
	

}
