package com.framework.testngtemplate.pages;

import java.io.IOException;
import java.util.List;
import java.util.TreeMap;
import java.util.stream.IntStream;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.aventstack.extentreports.Status;
import com.framework.testngtemplate.locators.Product_locaters;

import Code_dumps.Repeatative_codes;
import Reports_Listeners.ReportListeners;

public class Add_Product_to_cart extends Login{
	
	String name_of_product;
	String Desired_product="Iphone 6";
	
	
	@Test(dataProvider="Address_datas")
	public void product_add(TreeMap<String,String>data) throws IOException, InterruptedException{
		
		Product_locaters pl = new Product_locaters(d);
		JavascriptExecutor js = (JavascriptExecutor)d;
		 Repeatative_codes rpc = new Repeatative_codes(d);
		
		logging_in();
		Thread.sleep(800);
		List<WebElement> products = pl.Product_names();
        for(WebElement product:products){
        	name_of_product= product.getText().trim();
            ReportListeners.log_print_in_report().log(Status.INFO, "Product is "+name_of_product);
        	if(name_of_product.contains(Desired_product)) {
        		product.click();
        		break;}} 
        Thread.sleep(800);
		pl.Add_to_cart_button().click(); 
		Thread.sleep(800);
		String alert_message= d.switchTo().alert().getText();
		ReportListeners.log_print_in_report().log(Status.INFO, alert_message);
		d.switchTo().alert().accept(); 
		pl.Header_cart_accessor().click();
		Thread.sleep(1800);
	    String Cart_Product_name= pl.cart_product_list_contents().get(0).getText().trim();
	    ReportListeners.log_print_in_report().log(Status.INFO,Cart_Product_name.contains(name_of_product) ? "Testcase Passed cart product name "+Cart_Product_name+" equals ordered product name  "+name_of_product:"Testcase Failed cart product name "+Cart_Product_name+" not equals "+name_of_product);
		pl.Place_order_button().click();
		rpc.Scroll_to_element(pl.address_form_submit_button());
		Thread.sleep(800);
		pl.address_form_submit_button().click();
		Thread.sleep(800);
		ReportListeners.log_print_in_report().log(Status.INFO,d.switchTo().alert().getText().trim().contains("Please fill out Name and Creditcard.")?"Testcase Passed Address form blank submit error message given ---->>>   "+d.switchTo().alert().getText().trim():"Testcase Passed Address form blank submit error message given ---->>>   ");
		d.switchTo().alert().accept();
		Thread.sleep(800);
		rpc.Scroll_to_element(pl.input_fields().get(3));
		pl.input_fields().get(3).sendKeys(data.get("Credit card"));
		rpc.Scroll_to_element(pl.address_form_submit_button());
		Thread.sleep(800);
		pl.address_form_submit_button().click();
		Thread.sleep(800);
		String new_alert_message= d.switchTo().alert().getText();
		ReportListeners.log_print_in_report().log(Status.INFO, new_alert_message);
		d.switchTo().alert().accept();
		rpc.Scroll_to_element(pl.input_fields().get(0));
		pl.input_fields().get(0).sendKeys(data.get("Name"));
		rpc.Scroll_to_element(pl.address_form_submit_button());
		Thread.sleep(800);
		pl.address_form_submit_button().click();
		Thread.sleep(800);
		ReportListeners.log_print_in_report().log(Status.INFO,pl.order_confirmation_text().getText());
		d.findElement(By.xpath("((//p)[9]//parent::div//button[1])[2]")).click();
		Thread.sleep(1800);
	}
	
	
	
	
	
	@DataProvider
	public Object[][] Address_datas(){
		
		
		    TreeMap<String, String> row1 = new TreeMap<>();
	        row1.put("Name", "Ayan Sengupta");
	        row1.put("Country", "India");
	        row1.put("City", "Kolkata");
	        row1.put("Credit card", "4111111111111111");
	        row1.put("Month", "12");
	        row1.put("Year", "2027");
	        
            TreeMap<String, String> row2 = new TreeMap<>();
	        row2.put("Name", "John Doe");
	        row2.put("Country", "USA");
	        row2.put("City", "New York");
	        row2.put("Credit card", "5555555555554444");
	        row2.put("Month", "05");
	        row2.put("Year", "2026");
		
		 
		 return new Object[][]{{row1},{row2}};
		
	}
	
	

	  @Test
      public void remove_product_from_cart() throws IOException, InterruptedException{
    	  
    	  
    	  Product_locaters pl = new Product_locaters(d);
    	  Repeatative_codes rpc = new Repeatative_codes(d);
    	  
    	  logging_in();
    	  pl.Header_cart_accessor().click();
    	  Thread.sleep(1800);
    	  List<WebElement> no_of_prod= pl.cart_product_list_contents();
    	  System.out.println("number of products in cart  "+no_of_prod.size());
    	  IntStream.rangeClosed(0, no_of_prod.size()).forEach(rp->{
    		 WebElement prod_del_button= no_of_prod.get(rp).findElement(By.xpath(".//a"));
    		 rpc.wait_for_theElement(prod_del_button);
    		 prod_del_button.click();
    		 try {
				Thread.sleep(800);} 
    		 catch (Exception e) {
				e.printStackTrace();}});
    	 
	  
	  }



}
