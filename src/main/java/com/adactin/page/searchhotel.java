package com.adactin.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class searchhotel extends Basepage {

	@FindBy(name="location")
	private WebElement locationnn;
	
	@FindBy(name="hotels")
	private WebElement hotel ;
	@FindBy(name="room_type")
	private WebElement roomtype;
	@FindBy(name="room_nos")
	private WebElement roomno;
	@FindBy(id="datepick_in")
	private WebElement datepick;
	@FindBy(id="datepick_out")
	private WebElement datepickout;
	@FindBy(name="adult_room")
	private WebElement adultroom;
	@FindBy(name="child_room")
	private WebElement childroom ;
	@FindBy(id="Submit")
	private WebElement submit;
	
	public searchhotel() {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement location() {
		return location;
	}
	public WebElement hotelss() {
		return hotel ;
	}
	public WebElement roomtype() {
		return roomtype ;
	}
	public WebElement roomno () {
		return roomno ;
	}
	public WebElement datepickin () {
		return datepick ;
	}
	public WebElement datepickout() {
		return datepickout;
	}
	public WebElement adult() {
		return adultroom;
	}
	public WebElement child() {
		return childroom;
	}
	public WebElement submit () {
		return submit;
	}

	
	
	
	
	
}
