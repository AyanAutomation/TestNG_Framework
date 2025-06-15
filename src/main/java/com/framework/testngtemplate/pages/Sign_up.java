package com.framework.testngtemplate.pages;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.framework.testngtemplate.locators.Sign_up_locaters;

public class Sign_up extends Base{
	
	@Test(dataProvider="signupDatas")
	void Sign_up_form(String f,String l){
		
		Sign_up_locaters ss = new Sign_up_locaters(d);
		
		
		
		
	}
	
	
	@DataProvider
	public Object[][] signupDatas(){
		
		
		return new Object[][]{{}};
		
		
		
	}
	

}
