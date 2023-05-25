package testCases;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import baseDriver.BaseClass;

public class SignupTestcase extends BaseClass {
	@Test
	public void tc001_validSignUp() throws Exception{
		SignupElement se = new SignupElement();
		se.SignUp("prajakta", "varpe", "prajaktaghule000@gmail.com", "one+one=two", "one+one=two", "9822633405");
		
		
		Assert.assertEquals("Best Buy: Create an Account", driver.getTitle());
		System.out.println(driver.getTitle());
}

	@Test
	public void tc002_NoFirstName() {
		SignupElement se = new SignupElement();
		se.SignUp("", "varpe", "prajaktaghule000@gmail.com", "one+one=two", "one+one=two", "9822633405");
		Assert.assertEquals("Please enter your first name.", se.firstnameerror());
}
	@Test
	public void tc003_noLastName() {
		SignupElement se = new SignupElement();
		se.SignUp("prajakta", "", "prajaktaghule000@gmail.com", "one+one=two", "one+one=two", "9822633405");
		Assert.assertEquals("Please enter your last name.", se.lastnameerror());
}
	@Test
	public void tc004_noemailId() {
		SignupElement se = new SignupElement();
		se.SignUp("prajakta", "varpe", "", "one+one=two", "one+one=two", "9822633405");
		Assert.assertEquals("Please enter a valid email address", se.emailError());
}
	@Test
	public void tc006_InvalidemailId() {
		SignupElement se = new SignupElement();
		se.SignUp("prajakta", "varpe", ".com", "one+one=two", "one+one=two", "9822633405");
		Assert.assertEquals("Please enter a valid email address", se.emailError());      /////check
}
	@Test
	public void tc005_nopassword() {
		SignupElement se = new SignupElement();
		se.SignUp("prajakta", "varpe", "prajaktaghule000@gmail.com", "", "one+one=two", "9822633405");
		Assert.assertEquals("Please enter a strong password.", se.passwordError());
}
	@Test
	public void tc007_noreenterpassword() {
		SignupElement se = new SignupElement();
		se.SignUp("prajakta", "varpe", "prajaktaghule000@gmail.com", "one+one=two", "", "9822633405");
		Assert.assertEquals("Please reenter your password.", se.reEnterpassError());
}
	@Test
	public void tc008_nophonenum() {
		SignupElement se = new SignupElement();
		se.SignUp("prajakta", "varpe", "prajaktaghule000@gmail.com", "one+one=two", "one+one=two", "");
		Assert.assertEquals("Please enter a valid mobile phone number.", se.phoneError());
}
	@Test
	public void tc009_invalidphone() {
		SignupElement se = new SignupElement();
		se.SignUp("prajakta", "varpe", "prajaktaghule000@gmail.com", "one+one=two", "one+one=two", "5623659");
		Assert.assertEquals("Please enter a valid mobile phone number.", se.phoneError());
}
	@Test
	public void tc010_passwordmatch() {
		SignupElement se = new SignupElement();
		se.SignUp("prajakta", "varpe", "prajaktaghule000@gmail.com", "one+one=two", "one+one=two", "9822633405");
		Assert.assertEquals(se.password,se.reenterpassword);
	
			
		}
}