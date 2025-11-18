package com.framework.testngtemplate.pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import io.github.bonigarcia.wdm.WebDriverManager;


public class Base {
 
	public WebDriver d;
	String url;
	
	
	
	@BeforeMethod
	void setup() throws IOException{
		
		Fllelib f = new Fllelib(); 
		String Browsername= System.getProperty("Browser")!=null ? System.getProperty("Browser") : f.Data_reader("Browser_1");
		url = System.getProperty("url")!=null ? System.getProperty("url") : f.Data_reader("login_url");
		
		if(Browsername.equalsIgnoreCase("Chrome"))
		{
		WebDriverManager.chromedriver().setup();
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		}
		
		if(Browsername.equalsIgnoreCase("Firefox"))
		{
		WebDriverManager.firefoxdriver().setup();
		WebDriver d = new FirefoxDriver();
		d.manage().window().maximize();	
		}
		
		
		
		
	}
	
	
	
	@AfterMethod
	void driverKill(){
		
		
		if(d!=null){
			
			d.quit();
			System.out.println("After Method Runned Successfully");
		}
		
		
		
		
		
	}
	
	
}
