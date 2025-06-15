package com.framework.testngtemplate.pages;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.framework.testngtemplate.locators.Login_Locaters;

public class Login extends Base{
	
	@Test(dataProvider="login_datas")
	void loggingin(String id , String Password){
		
		Login_Locaters l = new Login_Locaters(d);
		
		}
	
	@DataProvider
	public Object[][] login_datas() throws IOException{
		
		Fllelib f = new Fllelib();
		
		return new Object[][]{{"",""},{"",f.Data_reader("")},{f.Data_reader(""),""},{f.Data_reader(""),f.Data_reader("")}};
		}
	

}
