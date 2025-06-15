package com.framework.testngtemplate.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Hello world!
 */
public class Base {
 
	WebDriver d;
	
	@BeforeMethod
	void setup(){
		
		WebDriverManager.chromedriver().setup();
		WebDriver d = new ChromeDriver();
		
		
		
		
	}
	
	
	
	@AfterMethod
	void driverKill(){
		
		
		if(d!=null){
			
			d.quit();
			System.out.println("After Method Runned Successfully");
		}
		
		
		
		
		
	}
	
	
}
