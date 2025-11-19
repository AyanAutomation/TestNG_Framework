package com.framework.testngtemplate.pages;

import java.io.IOException;
import java.util.TreeMap;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.framework.testngtemplate.locators.Sign_up_locaters;
import com.github.dockerjava.api.model.Info;

import Reports_Listeners.ReportListeners;

@Listeners(Reports_Listeners.ReportListeners.class)
public class Sign_up extends Base{
	
	String alert_text;
	
	@Test(dataProvider="signupDatas")
	void Sign_up_form(TreeMap<String,String> data) throws IOException, InterruptedException{
		
		Sign_up_locaters ss = new Sign_up_locaters(d);
        
		String Username = data.get("id");
		String Password = data.get("pass");
		
		
        d.get(target_url);
		ss.Header_links().get(3).click();
		ss.submit_button().click();
		Thread.sleep(800);
		alert_text= d.switchTo().alert().getText();
	    ReportListeners.log_print_in_report().log(Status.INFO,alert_text.contains("Please fill out Username and Password.") ? " Testcase Passed Blank id and pass showing error message "+alert_text:"Testcase Failed Blank id and pass not showing error message");
		d.switchTo().alert().accept();
		ss.input_fields().get(0).clear();
		ss.input_fields().get(1).sendKeys(Password);
		ss.submit_button().click();
		Thread.sleep(800);
		String blank_id_alert_text= d.switchTo().alert().getText();
		ReportListeners.log_print_in_report().log(Status.INFO,blank_id_alert_text.contains("Please fill out Username and Password.") ? "Testcase Passed Blank id showing error message  "+blank_id_alert_text:"Testcase Failed Blank id and pass not showing error message");
		d.switchTo().alert().accept();
		ss.input_fields().get(1).clear();
		ss.input_fields().get(0).sendKeys(Username);
		ss.submit_button().click();
		Thread.sleep(800);
		String blank_password_alert_text= d.switchTo().alert().getText();
		ReportListeners.log_print_in_report().log(Status.INFO,blank_password_alert_text.contains("Please fill out Username and Password.") ? "Testcase Passed Blank password showing error message  "+blank_password_alert_text:"Testcase Failed Blank password not showing error message");
		d.switchTo().alert().accept();
		ss.input_fields().get(0).clear();
		ss.input_fields().get(1).clear();
		ss.input_fields().get(0).sendKeys(Username);
		ss.input_fields().get(1).sendKeys(Password);
		ss.submit_button().click();
		Thread.sleep(800);
		String Signup_toast = d.switchTo().alert().getText();
		ReportListeners.log_print_in_report().log(Status.INFO,!Username.contains(".com")&&Signup_toast.contains("Sign up successful.")?"Testcase failed "+Username+" showing "+Signup_toast:"Testcase passed "+Username+" showing "+Signup_toast);
		ReportListeners.log_print_in_report().log(Status.INFO,Username.contains(".com")&&Password.contains("1")&&Signup_toast.contains("Sign up successful.")?"Testcase passed "+Username+" showing "+Signup_toast:"Testcase failed "+Username+" showing "+Signup_toast);
		ReportListeners.log_print_in_report().log(Status.INFO,Signup_toast.contains("This user already exist.")?"Testcase passed "+Username+" showing "+Signup_toast:"Testcase failed "+Username+" showing "+Signup_toast);
		
	}
	
	
	
	@DataProvider
	public Object[][] signupDatas() throws IOException{
		
		Fllelib f = new Fllelib();
		
		TreeMap<String,String> t1 = new TreeMap<String,String>();
	    t1.put("id", "alpha@_test");
	    t1.put("pass", "pass0011");
        TreeMap<String,String> t2 = new TreeMap<String,String>();
	    t2.put("id", "beta_user@yopmail.com");
	    t2.put("pass", "1");
        TreeMap<String,String> t3 = new TreeMap<String,String>();
	    t3.put("id", "gamma.login@yopmail.com");
	    t3.put("pass", "secure7788");
		TreeMap<String,String> t4 = new TreeMap<String,String>();
		t4.put("id", f.Data_reader("valid_id"));
		t4.put("pass", f.Data_reader("valid_pass"));
		return new Object[][] {{t1},{t2},{t3},{t4}};
		
		
		
	}

}
;