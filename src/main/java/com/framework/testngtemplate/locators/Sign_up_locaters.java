package com.framework.testngtemplate.locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Code_dumps.Repeatative_codes;

public class Sign_up_locaters extends Repeatative_codes{

	
	@FindBy(xpath="//*[@data-toggle='modal']")
	private List <WebElement> Header_links; 
	@FindBy(xpath="(//*[@class='modal-content'])[2]")
	private WebElement pop_up; /*
	@FindBy(xpath="")
	private WebElement  ;
	@FindBy(xpath="")
	private WebElement  ;
	@FindBy(xpath="")
	private WebElement  ;
	@FindBy(xpath="")
	private WebElement  ;
	@FindBy(xpath="")
	private WebElement  ;
	@FindBy(xpath="")
	private WebElement  ;
	@FindBy(xpath="")
	private WebElement  ;
	@FindBy(xpath="")
	private WebElement  ;
	@FindBy(xpath="")
	private WebElement  ;
	@FindBy(xpath="")
	private WebElement  ;
	@FindBy(xpath="")
	private WebElement  ;
	@FindBy(xpath="")
	private WebElement  ;
	@FindBy(xpath="")
	private WebElement  ;
	@FindBy(xpath="")
	private WebElement  ;
	@FindBy(xpath="")
	private WebElement  ;
	@FindBy(xpath="")
	private WebElement  ;  */

	public Sign_up_locaters(WebDriver d){
	super(d);
	PageFactory.initElements(d, this); }


	
	
	public List <WebElement> Header_links(){
	wait_for_theElement(Header_links);
	return Header_links;} 
	public WebElement pop_up(){
	wait_for_theElement(pop_up);
	return pop_up;} 
	public List <WebElement> input_fields(){
	pop_up();
	List <WebElement> input_fields = pop_up().findElements(By.xpath(".//input"));
	wait_for_theElement(input_fields);
	return input_fields;}
	public WebElement submit_button(){
	pop_up();
	WebElement submit_button = pop_up().findElement(By.xpath(".//button[@onclick='register()']"));
	wait_for_theElement(submit_button);
	return submit_button;} /*
	public WebElement (){
	wait_for_theElement();	
	return ;}
	public WebElement (){
	wait_for_theElement();
	return ;}
	public WebElement (){
	wait_for_theElement();
	return ;}
	public WebElement (){
	wait_for_theElement();
	return ;}
	public WebElement (){
	wait_for_theElement();
	return ;}
	public WebElement (){
	wait_for_theElement();
	return ;}
	public WebElement (){
	wait_for_theElement();	
	return ;}
	public WebElement (){
	wait_for_theElement();
	return ;}
	public WebElement (){
	wait_for_theElement();
	return ;}
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
