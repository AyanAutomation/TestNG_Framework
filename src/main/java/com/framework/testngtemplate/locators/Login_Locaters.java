package com.framework.testngtemplate.locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Code_dumps.Repeatative_codes;

public class Login_Locaters extends Repeatative_codes {

	@FindBy(xpath="")
	private WebElement login_id_field;
	@FindBy(xpath="")
	private WebElement password_field;
	@FindBy(xpath="")
	private WebElement password_eye_button;
	@FindBy(id="login2")
	private WebElement Login_button;
	@FindBy(xpath="")
	private WebElement Success_toast;
	@FindBy(xpath="")
	private WebElement Error_messages; /*
	@FindBy(xpath="")
	private WebElement Login_submit_button;
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
	private WebElement  ; */
	
	
	
	public Login_Locaters(WebDriver d){
		
	super(d);	
	PageFactory.initElements(d, this);	
		
	}
	
	
	
	public WebElement login_id(){
	wait_for_theElement(login_id_field);	
	return login_id_field;}
	public WebElement password_field(){
	wait_for_theElement(password_field);
	return password_field;}
	public WebElement password_eye_button(){
	wait_for_theElement(password_eye_button);
	return password_eye_button;}
	public WebElement Login_button(){
	wait_for_theElement(Login_button);
	return Login_button;}
	public WebElement Success_toast(){
	wait_for_theElement(Success_toast);
	return Success_toast;}
	public WebElement Error_messages(){
	wait_for_theElement(Error_messages);
	return Error_messages;} /*
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
