package testCases;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import baseDriver.BaseClass;

public class LoginElements extends BaseClass{
	
	@FindBy(xpath="//a[@class='c-button c-button-secondary c-button-sm sign-in-btn']")
	WebElement Account_signin;

	@FindBy(xpath="//span[@class='v-p-right-xxs line-clamp']")
	WebElement account;
	
	@FindBy(xpath="//img[@alt='United States']")
	WebElement US;
	
	@FindBy(xpath="//input[@id='fld-e']")
	WebElement email;
	
	@FindBy(xpath="//input[@id='fld-p1']")
	WebElement password;
	
	@FindBy(xpath="//button[@data-track='Sign In']")
	WebElement signin;
	
	@FindBy(xpath="//p[contains(text(),'Please enter a valid email address.')]")
	WebElement noemail;
	
	@FindBy(xpath="//p[contains(text(),'Please enter your password.')]")
	WebElement NoPass;
	
	@FindBy(xpath="//*[contains(text(),'The password was incorrect. Please try again.')]")
	WebElement IncorrectPass;
	
	@FindBy(xpath="//input[@id='gh-search-input']")
	WebElement Search;	
	
	//product
	@FindBy(xpath="(//img[@alt='OnePlus - 11 5G 256GB (Unlocked) - Titan Black - Front_Zoom'])[1]")
	WebElement onepluse;
	
	public LoginElements() {
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
		
			}
	public String getTextnoemail() {
		String actual=noemail.getText();
		return actual;
	}
	public String getTextnopass() {
		String actual=NoPass.getText();
		return actual;
	}
	public String getTextincorrectpass() {
		String actual=IncorrectPass.getText();
		return actual;
	}
	public void explicitwaitcall() {
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.titleContains("Best Buy | Official Online Store | Shop Now & Save"));
	}
	public void search(String search) {
		this.Search.sendKeys(search);
		onepluse.click();
	}
}
