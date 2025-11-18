package com.framework.testngtemplate.pages;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.framework.testngtemplate.locators.Login_Locaters;

import Reports_Listeners.Extent_reports_and_listerners;


@Listeners(Reports_Listeners.Listeners.class)
public class Login extends Base{
	
	@Test
	void logging_in() throws IOException{
		
		Login_Locaters l = new Login_Locaters(d);
		Fllelib f = new Fllelib();
		
		d.get(url);
		
		
		
		
		
		
		
		}
	
	
	

}
