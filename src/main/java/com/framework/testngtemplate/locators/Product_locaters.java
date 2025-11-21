package com.framework.testngtemplate.locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Code_dumps.Repeatative_codes;

public class Product_locaters extends Repeatative_codes{
	
	
	@FindBy(xpath="//*[@class='col-lg-9']//h4")
	private List <WebElement>  Product_names; 
	@FindBy(xpath="//*[@class='btn btn-success btn-lg']")
	private WebElement Add_to_cart_button; 
	@FindBy(xpath="//a[@href='cart.html']")
	private WebElement Header_cart_accessor; 
	@FindBy(xpath="//tbody//tr")
	private List <WebElement> cart_product_list_contents; 
	@FindBy(xpath="//button[@class='btn btn-success']")
	private WebElement Place_order_button; 
	@FindBy(xpath="(//form)[3]")
	private WebElement Pop_order_address_form;  
	@FindBy(xpath="(//*[@class='modal-content'])[3]//button[@onclick]")
	private WebElement address_form_submit_button;
	@FindBy(xpath="(//p)[9]")
	private WebElement order_confirmation_text; /*
	@FindBy(xpath="")
	private WebElement  ;
	@FindBy(xpath="")
	private WebElement  ;
	@FindBy(xpath="")
	private WebElement  ;
	@FindBy(xpath="")
	private WebElement  ;
	@FindBy(xpath="")
	private WebElement  */
	
	public Product_locaters(WebDriver d){
	super(d);
	PageFactory.initElements(d, this); }
	
	
	public List <WebElement> Product_names(){
	wait_for_theElement(Product_names);	
	return Product_names;} 
	public WebElement Add_to_cart_button(){
	wait_for_theElement(Add_to_cart_button);
	return Add_to_cart_button;} 
	public WebElement Header_cart_accessor(){
	wait_for_theElement(Header_cart_accessor);
	return Header_cart_accessor;} 
	public List <WebElement> cart_product_list_contents(){
	wait_for_theElement(cart_product_list_contents);
	return cart_product_list_contents;} 
	public WebElement Place_order_button(){
	wait_for_theElement(Place_order_button);
	return Place_order_button;} 
	public WebElement Pop_order_address_form(){
	wait_for_theElement(Pop_order_address_form);
	return Pop_order_address_form;} 
	public List <WebElement> input_fields(){
	Pop_order_address_form();
	List <WebElement> input_fields = Pop_order_address_form().findElements(By.xpath(".//input"));
	wait_for_theElement(input_fields);	
	return input_fields;} 
	public WebElement address_form_submit_button(){
	wait_for_theElement(address_form_submit_button);
	return address_form_submit_button;} 
	public WebElement order_confirmation_text(){
	wait_for_theElement(order_confirmation_text);
	return order_confirmation_text;} /*
	public WebElement (){
	wait_for_theElement();
	return ;}
	public WebElement (){
	wait_for_theElement();
	return ;}
	public WebElement (){
	wait_for_theElement();
	return ;} */
	
	
	
	
	

}
