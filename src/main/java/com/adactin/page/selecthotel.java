package com.adactin.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class selecthotel extends Basepage{

@FindBy(id="radiobutton_0")
private WebElement  radio;
@FindBy(id="continue")
private WebElement continee;

public selecthotel() {
	PageFactory.initElements(driver, this);
}
public WebElement radioo() {
	return radio;
}
public WebElement continueee() {
	return continee;
}



}
