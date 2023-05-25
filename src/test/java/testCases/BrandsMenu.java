package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseDriver.BaseClass;

public class BrandsMenu extends BaseClass{
@Test
public void tcoo1_addToCart() throws Exception{
	BrandsMenuElement bme = new BrandsMenuElement();
	bme.search();
//	Thread.sleep(2000);
//	Assert.assertEquals("Added to cart", bme.addedmsg.getText());
}
}