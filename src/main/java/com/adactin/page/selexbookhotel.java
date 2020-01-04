package com.adactin.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class selexbookhotel extends Basepage{

	@FindBy(id="first_name")
	private WebElement  first;
	@FindBy(id="last_name")
	private WebElement last ;
	@FindBy(id="address")
	private WebElement addres ;
	@FindBy(id="cc_num")
	private WebElement cnum ;
	@FindBy(name="cc_type")
	private WebElement ctype ;
	@FindBy(name="cc_exp_month")
	private WebElement ccexp ;
	@FindBy(name="cc_exp_year")
	private WebElement ccexpy ;
	
	
	
	@FindBy(id="cc_cvv")
	private WebElement ccv ;
	@FindBy(id="book_now")
	private WebElement book ;
	@FindBy(id="order_no")
	private WebElement order ;
	
	public selexbookhotel() {
		PageFactory.initElements(driver, this);
	}
//	public WebElement () {
//		return  ;
//	}
//	public WebElement () {
//		return  ;
//	}
//	public WebElement () {
//		return  ;
//	}
//	public WebElement () {
//		return  ;
//	}
//	public WebElement () {
//		return  ;
//	}
//	public WebElement () {
//		return  ;
//	}
//	public WebElement () {
//		return  ;
//	}
	
	
	
	
	
}
