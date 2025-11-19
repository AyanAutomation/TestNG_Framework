package com.framework.testngtemplate.pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.framework.testngtemplate.locators.Login_Locaters;


@Listeners(Reports_Listeners.ReportListeners.class)
public class Login extends Base{
	
	
	
    @Test
	public void logging_in() throws IOException{
		
		Login_Locaters l = new Login_Locaters(d);
		d.get(target_url);
		l.Login_button().click();
		}}
