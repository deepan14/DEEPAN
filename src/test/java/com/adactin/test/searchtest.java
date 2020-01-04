package com.adactin.test;

import org.testng.annotations.Test;

import com.adactin.page.Basepage;
import com.adactin.page.searchhotel;

public class searchtest  extends homepagetest{
searchhotel search;
Basepage bp;
public searchtest() {
	search=new searchhotel();
	bp=new Basepage();
	}
	
@Test
public void verifysearchhotel() {
	search.selectFromDropDown(search.location(),1);
	search.selectFromDropDown(search.hotelss(), 2);
	search.selectFromDropDown(search.roomtype(), 2);
	search.selectFromDropDown(search.roomno(), 1);
	search.setText(search.datepickin(), "22/12/2019");
	search.setText(search.datepickout(),"28/12/2019");
	
	
	search.selectFromDropDown(search.adult(), 2);
	search.selectFromDropDown(search.child(), 1);
	search.submit().click();
	
}



	
}
