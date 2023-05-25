package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseDriver.BaseClass;

public class BottonLinkTestCase extends BaseClass {
	String expected="BestBuy.com Terms and Conditions";
	String expectedservices="Schedule a Service - Best Buy";
	@Test
	public void tcoo1_totalLinks() {
		BottonLinkElement bl = new BottonLinkElement();		
			bl.allbottonlink();	
			Assert.assertEquals("BestBuy.com Terms and Conditions", driver.getTitle());
	}
	@Test
	public void tcoo2_validateTerms() {
		BottonLinkElement bl = new BottonLinkElement();					
				bl.terms();
				Assert.assertEquals(expected, driver.getTitle());
			
	}
	@Test
	public void tcoo2_validateservices() {
		BottonLinkElement bl = new BottonLinkElement();					
				bl.services();
				Assert.assertEquals(expectedservices, driver.getTitle());
			
	}
}