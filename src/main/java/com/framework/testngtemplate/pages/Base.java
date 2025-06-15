package com.framework.testngtemplate.pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import io.github.bonigarcia.wdm.WebDriverManager;


public class Base {
 
	WebDriver d;
	
	@BeforeMethod
	void setup() throws IOException{
		
		Fllelib f = new Fllelib(); 
		String Browsername=  f.Data_reader("Browser_1");
		
		if(Browsername.equalsIgnoreCase("chrome"))
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
