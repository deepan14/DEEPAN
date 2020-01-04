package com.adactin.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.adactin.page.Basepage;
import com.adactin.page.homepageobject;

public class homepagetest {
	homepageobject hp;
	Basepage bp;

	public homepagetest() {
		hp = new homepageobject();
		bp = new Basepage();
	}
	@Test
	public void dd(){
		hp.userid().sendKeys("vigneshvicky29");
		Assert.assertTrue(bp.elementFound(hp.userid()));
		
		hp.userpassword().sendKeys("vigneshvicky");
		Assert.assertTrue(bp.elementFound(hp.userpassword()));
		
		hp.click().click();
	//	Assert.assertTrue(bp.elementFound(hp.click()));

	}
	
	

	}





