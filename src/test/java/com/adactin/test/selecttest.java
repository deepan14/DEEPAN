package com.adactin.test;

import org.testng.annotations.Test;

import com.adactin.page.selecthotel;

public class selecttest extends searchtest {
	selecthotel select;
public selecttest() {
	select=new selecthotel();
}

@Test
public void verifyselecttest() {
	select.radioo().click();
	select.continueee().click();
}


}
