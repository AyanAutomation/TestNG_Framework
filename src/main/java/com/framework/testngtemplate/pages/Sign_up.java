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
        
		
        d.get(target_url);
		ss.Header_links().get(3).click();
		ss.input_fields().get(0).sendKeys(data.get("id"));
		ss.input_fields().get(1).sendKeys(data.get("pass"));
		ss.submit_button().click();
		Thread.sleep(800);try{
		alert_text= d.switchTo().alert().getText();	
		System.out.println(alert_text);
		System.out.println();
		ReportListeners.log_print_in_report().log(Status.INFO,alert_text);
		if(alert_text.contains("Sign up successful.")){
			System.out.println(data.get("id"));
			ReportListeners.log_print_in_report().log(Status.INFO,"email id  "+data.get("id"));
			System.out.println("Password  "+data.get("pass"));
			ReportListeners.log_print_in_report().log(Status.INFO,"Password  "+data.get("pass"));
			System.out.println(data.get("pass").contains("   ")?"Testcase Failed Taking blank Password":" Testcase Passed not taking blank password");
			System.out.println();}
		if(alert_text.contains("This user already exist.")){
			System.out.println(data.get("id"));
			ReportListeners.log_print_in_report().log(Status.INFO,"email id  "+data.get("id"));
			System.out.println("Password  "+data.get("pass"));
			ReportListeners.log_print_in_report().log(Status.INFO,"Password  "+data.get("pass"));
			System.out.println();} 
		d.switchTo().alert().accept();}
		catch(Exception k){
			Thread.sleep(800);	
			ss.submit_button().click();
			System.out.println(d.switchTo().alert().getText());
			System.out.println();
			if(alert_text.contains("Sign up successful.")){
				System.out.println(data.get("id"));
				ReportListeners.log_print_in_report().log(Status.INFO,"email id  "+data.get("id"));
				System.out.println("Password  "+data.get("pass"));
				ReportListeners.log_print_in_report().log(Status.INFO,"Password  "+data.get("pass"));
				System.out.println(data.get("pass").contains("   ")?"Testcase Failed Taking blank Password":" Testcase Passed not taking blank password");
				System.out.println();}
			if(alert_text.contains("This user already exist.")){
				System.out.println(data.get("id"));
				ReportListeners.log_print_in_report().log(Status.INFO,"email id  "+data.get("id"));
				System.out.println("Password  "+data.get("pass"));
				ReportListeners.log_print_in_report().log(Status.INFO,"Password  "+data.get("pass"));
				System.out.println();}
			d.switchTo().alert().accept();}}
	
	
	
	@DataProvider
	public Object[][] signupDatas() throws IOException{
		
		Fllelib f = new Fllelib();
		
		TreeMap<String,String> t1 = new TreeMap<String,String>();
		t1.put("id", "120g0@b");
		t1.put("pass", "   ");
		TreeMap<String,String> t2 = new TreeMap<String,String>();
		t2.put("id", "kb202@b.com");
		t2.put("pass", "   ");
		TreeMap<String,String> t3 = new TreeMap<String,String>();
		t3.put("id", "n202@lb.com");
		t3.put("pass", "4455235");
		TreeMap<String,String> t4 = new TreeMap<String,String>();
		t4.put("id", f.Data_reader("valid_id"));
		t4.put("pass", f.Data_reader("valid_pass"));
		
		return new Object[][] {{t1},{t2},{t3},{t4}};
		
		
		
	}

}
;