package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseDriver.BaseClass;

public class Open_navigate_TestCase extends BaseClass{

	@Test
	public void tc001() throws Exception {
		Open_navigate_Element one=new Open_navigate_Element();
			//	one.navigate();
	}
	@Test
	public void tc002() throws Exception {
		Open_navigate_Element one=new Open_navigate_Element();
		one.single();
		Assert.assertEquals("Gift Ideas 2023: Best Gifts to Give This Year - Best Buy", driver.getTitle());
		
	}
	@Test
	public void tc003() throws Exception {
		Open_navigate_Element one=new Open_navigate_Element();
		one.mm();
		Assert.assertEquals("LEGO - Best Buy", driver.getTitle());
	}
	
//	@Test
//	public void tc002() throws Exception {
//		Open_navigate_Element one=new Open_navigate_Element();
//				one.single();
//		Assert.assertEquals(one.actualtitle_top, driver.getTitle());
//	}
}
