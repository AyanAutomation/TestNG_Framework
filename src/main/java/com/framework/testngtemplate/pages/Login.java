package com.framework.testngtemplate.pages;

import java.io.IOException;

import org.testng.annotations.Test;

import com.framework.testngtemplate.locators.Login_Locaters;

public class Login extends Base{
	
	@Test
	void logging_in() throws IOException{
		
		Login_Locaters l = new Login_Locaters(d);
		Fllelib f = new Fllelib();
		
		d.get(f.Data_reader("login_url"));
		
		
		
		
		
		
		
		}
	
	
	

}
