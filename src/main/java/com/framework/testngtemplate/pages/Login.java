package com.framework.testngtemplate.pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.framework.testngtemplate.locators.Login_Locaters;
import com.framework.testngtemplate.locators.Sign_up_locaters;


@Listeners(Reports_Listeners.ReportListeners.class)
public class Login extends Base{
	
	
	
    
	public void logging_in() throws IOException{
		
		Login_Locaters l = new Login_Locaters(d);
		
		Fllelib f = new Fllelib();
		
		d.get(target_url);
		l.Login_button().click();
		l.login_id().sendKeys(f.Data_reader("valid_id"));
		l.password_field().sendKeys(f.Data_reader("valid_pass"));
		l.Login_submit_button().click();
		l.logout_button();
		}}
