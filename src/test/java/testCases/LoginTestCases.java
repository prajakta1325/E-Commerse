package testCases;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import baseDriver.BaseClass;

/*
 * 1. title check
 * 2. invalid emailID correct password
 * 3. incorrect emilID correct password
 * 4.  valid emailID incorrect password
 * 5. valid emailID no password
 * 6. valid emailID valid password
 */
public class LoginTestCases extends BaseClass {

	

	@Test
	public void tC001_title() {
		LoginElements le = new LoginElements();
		System.out.println(driver.getTitle());
		Assert.assertEquals("Best Buy | Official Online Store | Shop Now & Save", driver.getTitle());
		
	}
	@Test
	public void tC002_invalidEmail() {
		LoginElements le = new LoginElements();
		try {
			le.logIn("prajakta27v", "one+one=one");
			System.out.println(le.getTextnoemail());
			Assert.assertEquals("Please enter a valid email address.", le.getTextnoemail());
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		
	}

	@Test // incorrect emailID
	public void tC003_incorrectPassword() {
		LoginElements le = new LoginElements();
		try {
			le.logIn("prajakta27v@gmail.com", "abc+abc=abc");
			System.out.println(le.getTextnoemail());
			Assert.assertEquals("Please enter a valid email address.", le.getTextnoemail());
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		

	}

	@Test
	public void tC004_BlankPass() throws Exception {
		LoginElements le = new LoginElements();
		
		try {
			le.logIn("prajakta27v@gmail.com", "");
			System.out.println(le.getTextnopass());
			Assert.assertEquals("Please enter your password.", le.getTextnopass());
			}
			catch(Exception e) {
				e.printStackTrace();
			}		
	}

	@Test
	public void tC005_IncorrectPass()  {
		LoginElements le = new LoginElements();
		try {
			le.logIn("prajakta27v@gmail.com", "one+=two");
			System.out.println(le.getTextincorrectpass());
			Assert.assertEquals("The password was incorrect. Please try again.", le.getTextincorrectpass());
			}
			catch(Exception e) {
				e.printStackTrace();
			}		

	}

	@Test
	public void finalLogin() throws InterruptedException {
		LoginElements le = new LoginElements();
		try {
			le.logIn("prajaktaghule000@gmail.com", "one+one=two");
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		
		
	     
	}
}
