package com.adactin.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homepageobject extends Basepage{
	@FindBy(id="username")

	private WebElement adactinid23;

	private WebElement adactinid123;

	
	@FindBy(id="password")
	private WebElement adactinpassword;
	
	@FindBy(id="login")
	private WebElement loginclick;
	
	
	public homepageobject() {
		PageFactory.initElements(driver, this);
	}


	
	public WebElement userid()
	{
	return adactinid;	
	}
	public WebElement userpassword()
	{
	return adactinpassword;	
	}
	public WebElement click()
	{
	return loginclick;	
	}
	

}
