package com.framework.testngtemplate.pages;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.framework.testngtemplate.locators.Login_Locaters;

public class Login extends Base{
	
	
	@Test(dataProvider="login_datas")
	void loggingin(String id , String Password){
		
		Login_Locaters l = new Login_Locaters(d);
		
		
		
		
	}
	
	@DataProvider
	public Object[][] login_datas(){
		
		return new Object[][]{{}};
		}
	

}
