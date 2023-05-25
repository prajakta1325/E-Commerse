package testCases;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseDriver.BaseClass;

public class LogIn_LogOutElement extends BaseClass {
	@FindBy(xpath="//img[@alt='United States']")
	WebElement US;
	
	@FindBy(xpath="//input[@id='fld-e']")
	WebElement email;
	
	@FindBy(xpath="//input[@id='fld-p1']")
	WebElement password;
	
	@FindBy(xpath="//button[@data-track='Sign In']")
	WebElement signin;
	
	@FindBy(xpath="//a[@class='c-button c-button-secondary c-button-sm sign-in-btn']")
	WebElement Account_signin;

	@FindBy(xpath="//span[@class='v-p-right-xxs line-clamp']")
	WebElement account;
	
	@FindBy(xpath="//span[@class='v-p-right-xxs line-clamp']")
	WebElement logInClick;
	
	@FindBy(xpath="//button[@class='c-button-link account-menu-logout-button']")
	WebElement logout;
	
	public LogIn_LogOutElement() {
		PageFactory.initElements(driver, this);
		clickElement(US);
		clickElement(account);
	}
public void logIn(String email, String password) throws InterruptedException {
		
		clickElement(Account_signin);		
		this.email.sendKeys(email);
		this.password.sendKeys(password);		
		clickElement(signin);
		Thread.sleep(3000);
		clickElement(logInClick);	
		clickElement(logout);
		
			}

}
