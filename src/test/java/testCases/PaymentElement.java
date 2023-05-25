package testCases;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import baseDriver.BaseClass;

public class PaymentElement extends BaseClass {
// afterlogin prajakta27v@gmail.com
	// and password abc+abc=abc

	@FindBy(xpath = "//span[contains(text(),'Cart')]")
	WebElement cart;

	@FindBy(xpath = "//img[@alt='United States']")
	WebElement US;

	@FindBy(xpath = "//button[@class='btn btn-lg btn-block btn-secondary']")
	WebElement continueepayment;
	
	@FindBy(xpath = "(//button[@aria-label='Close'])[2]")
	WebElement close;

	@FindBy(xpath = "//button[@class='btn btn-lg btn-block btn-primary']")
	WebElement checkOut;

	@FindBy(xpath = "//button[@class='c-button c-button-secondary c-button-lg cia-guest-content__continue guest']")
	WebElement continueasGuest;
	
	@FindBy(name = "firstName")
	WebElement firstname;

	@FindBy(name = "lastName")
	WebElement lastname;

	@FindBy(xpath = "//input[@class='tb-input v-medium addressLine1']")
	WebElement address;

	@FindBy(id = "city")
	WebElement city;

	@FindBy(name = "state")
	WebElement state;

	@FindBy(id = "postalCode")
	WebElement zipcode;
	
	@FindBy(xpath="//span[@class='v-p-right-xxs line-clamp']")
	WebElement Account_signin;

	@FindBy(xpath="(//button[contains(text(),'Sign In')])[1]")
	WebElement account;
	
	@FindBy(xpath="(//input[@class='tb-input'])[1]")
	WebElement email;
	
	@FindBy(xpath="(//input[@class='tb-input'])[2]")
	WebElement password;
	
	@FindBy(xpath="//button[@data-track='Sign In']")
	WebElement signin;
	
	@FindBy(id = "save-for-billing-address-Map {}")
	WebElement billingCheckbox;
	
	@FindBy(xpath = "//button[@class='btn btn-lg btn-block btn-primary']")
	WebElement placeOrder;
	
	@FindBy(xpath = "//span[contains(text(),'Apply')]")
	WebElement apply;
	
	@FindBy(xpath = "//input[@class='tb-input v-medium ']")
	WebElement cardno;
	
	@FindBy(xpath = "//button[@class='c-button c-button-secondary c-button-md ']")
	WebElement keepadd;

	@FindBy(xpath = "//span[contains(text(),'Change pickup location')]")
	WebElement diff_location;
	
	@FindBy(xpath = "(//input[@class='tb-input'])[1]")
	WebElement guestemail;
	
	@FindBy(xpath = "(//span[contains(text(),'Continue to Payment Information')]")
	WebElement continuetopayment;

	@FindBy(xpath = "(//input[@class='tb-input'])[2]")
	WebElement guestphone;
	
	@FindBy(xpath = "//a[@class='btn btn-secondary btn-block btn-lg']")
	WebElement continueShop;
	
	@FindBy(xpath = "//input[@id='create-account-password-form-show-password']")
	WebElement pass;
	
	@FindBy(xpath = "//img[@alt='Beats by Dr. Dre - Beats Studio Buds + True Wireless Noise Cancelling Earbuds - Transparent']")
	WebElement image;
	
	@FindBy(xpath = "//button[@class='c-button c-button-primary c-button-lg c-button-block c-button-icon c-button-icon-leading add-to-cart-button']")
	WebElement addToCart;
	
	public PaymentElement() {
		PageFactory.initElements(driver, this);
		US.click();

	}
public void login() throws Exception {
//	clickElement(Account_signin);
//	
//	this.email.sendKeys("prajaktaghule000@gmail.com");
//	this.password.sendKeys("one+one=two");
//	clickElement(account);
//	clickElement(signin);
//	Thread.sleep(3000);
	
	LoginTestCases ltc = new LoginTestCases();
	ltc.finalLogin();
}
	public void addingToCart(String cardnoo, String fName, String lname, String Address, String city,
			String zipcode) throws Exception {
		
		clickElement(cart);
		clickElement(continueShop);
		clickElement(image);
		clickElement(addToCart);
		clickElement(checkOut);
		clickElement(continueepayment);
		clickElement(continueasGuest);
		guestphone.sendKeys("prajaktaghule000@gmail.com");;
		guestphone.sendKeys("9284185661");
		clickElement(continuetopayment);
		clickElement(cardno);   //1246 5879 6354
		cardno.sendKeys(cardnoo);
		firstname.sendKeys(fName);
		lastname.sendKeys(lname);
		address.sendKeys(Address);// Street: 334 Pearcy Avenue
		Select sel = new Select(state);// City: Fort Wayne
		sel.selectByValue("ID");
		this.state.sendKeys(city);// State/province/area: Indiana
		this.zipcode.sendKeys(zipcode);// Zip code 46804
		pass.sendKeys("one+one=two");
		clickElement(placeOrder);
		
//		clickElement(billingCheckbox);
//		clickElement(apply);
//		clickElement(keepadd);
	}
}
