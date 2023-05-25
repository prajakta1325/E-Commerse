package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseDriver.BaseClass;

public class Payment extends BaseClass {
	@Test
	public void tc001_search() throws Exception {
		
		PaymentElement pay = new PaymentElement();		
	
			pay.addingToCart("1246 5879 6354","prajakta", "varpe", "334 Pearcy Avenue", "Fort Wayne", "46804");
			

	}
}
