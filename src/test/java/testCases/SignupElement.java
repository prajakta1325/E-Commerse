package testCases;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseDriver.BaseClass;

public class SignupElement extends BaseClass{
	@FindBy(xpath="//span[@class='v-p-right-xxs line-clamp']")
	WebElement account;
	
	@FindBy(xpath="//img[@alt='United States']")
	WebElement US;
	
	@FindBy(xpath="//a[@class='c-button c-button-outline c-button-sm create-account-btn']")
	WebElement firstcreateAccount;

	@FindBy(xpath="//input[@id='firstName']")
	WebElement FirstName;
	
	@FindBy(xpath="//input[@id='lastName']")
	WebElement LastName;
	
	@FindBy(xpath="//input[@id='email']")
	WebElement EmailAddress;
	
	@FindBy(xpath="//input[@name='fld-p1']")
	WebElement password;
	
	@FindBy(xpath="//input[@id='reenterPassword']")
	WebElement reenterpassword;
	
	@FindBy(xpath="//input[@id='phone']")
	WebElement phone;
	
	@FindBy(xpath="//p[contains(text(),'Please enter your first name.')]")
	WebElement firstnameError;               //Please enter your first name.
	
	@FindBy(xpath="//p[contains(text(),'Please enter your last name.')]")
	WebElement lastnameError; //Please enter your last name.
	
	@FindBy(xpath="//p[contains(text(),'Please enter a valid email address.')]")
	WebElement emailError;   //Please enter a valid email address.
	
	@FindBy(xpath="//p[contains(text(),'Please enter a strong password.')]")
	WebElement passworderror;   //Please enter a strong password.
	
	@FindBy(xpath="//p[contains(text(),'Please reenter your password.')]")
	WebElement reenterpassworderror;   //Please reenter your password.
	
	@FindBy(xpath="//p[contains(text(),'Please enter a valid mobile phone number.')]")
	WebElement phoneError;    //Please enter a valid mobile phone number.
	
	@FindBy(xpath="//button[@class='c-button c-button-secondary c-button-lg c-button-block c-button-icon c-button-icon-leading cia-form__controls__submit ']")
	WebElement createAccount;
	
	public SignupElement() {
		PageFactory.initElements(driver, this);
	}
	public void SignUp(String firstname, String LastName, String emailID, String password, String reenterpassword, String phone) {
		clickElement(US);
		clickElement(account);
		clickElement(firstcreateAccount);
		this.FirstName.sendKeys(firstname);
		this.LastName.sendKeys(LastName);
		this.EmailAddress.sendKeys(emailID);
		this.password.sendKeys(password);
		this.reenterpassword.sendKeys(reenterpassword);
		this.phone.sendKeys(phone);		
		clickElement(createAccount);
	}

	public String firstnameerror() {
		String actual=firstnameError.getText();
		return actual;
	}
	public String lastnameerror() {
		String actual=lastnameError.getText();
		return actual;
	}
	public String emailError() {
		String actual=emailError.getText();
		return actual;
	}
	public String passwordError() {
		String actual=reenterpassworderror.getText();
		return actual;
	}
	public String reEnterpassError() {
		String actual=passworderror.getText();
		return actual;
	}
	public String phoneError() {
		String actual=phoneError.getText();
		return actual;
	}
}
