package testCases;

import org.testng.annotations.Test;

import baseDriver.BaseClass;

public class SearchAddCart extends BaseClass{
	@Test
	public void tC002_invalidEmail() throws Exception{
		SearchAddCartElement sce = new SearchAddCartElement();
		sce.search();
		sce.addedmsg.getText();
//		le.logIn("prajakta27v", "one+one=one");
//		System.out.println(le.getTextnoemail());
//		Assert.assertEquals("Please enter a valid email address.", le.getTextnoemail());
	}
}