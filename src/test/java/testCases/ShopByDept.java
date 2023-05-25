package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseDriver.BaseClass;

public class ShopByDept extends BaseClass{
	@Test
	public void tcoo1_addToCart() throws Exception{
		ShopByDeptElement sbde = new ShopByDeptElement();
		sbde.search();
		
		Assert.assertEquals("Added to cart", sbde.addedmsg.getText());//need to use explicit wait ********** how to use
	}
}
