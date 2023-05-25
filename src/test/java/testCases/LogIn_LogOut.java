package testCases;

import org.testng.annotations.Test;

import baseDriver.BaseClass;

public class LogIn_LogOut extends BaseClass {
	@Test
	public void finalLogin() throws InterruptedException {
		
		LogIn_LogOutElement le = new LogIn_LogOutElement();
		try {
			le.logIn("prajaktaghule000@gmail.com", "one+one=two");
			}
			catch(Exception e) {
				e.printStackTrace();
			}
}
	
}