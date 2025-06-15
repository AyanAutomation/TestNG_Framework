package com.framework.testngtemplate.pages;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.framework.testngtemplate.locators.Sign_up_locaters;

public class Sign_up extends Base{
	
	@Test(dataProvider="signupDatas")
	void Sign_up_form(String first,String l) throws IOException{
		
		Sign_up_locaters ss = new Sign_up_locaters(d);
        Fllelib f = new Fllelib();
		
        d.get(f.Data_reader("Signup_Page_url"));
		
		
		
		
		
		
		
		
	}
	
	
	@DataProvider
	public Object[][] signupDatas(){
		
		
		return new Object[][]{{}};
		
		
		
	}
	

}
