package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseDriver.BaseClass;

public class SearchAddCartElement extends BaseClass{
	//sign in
	
	
	@FindBy(xpath="//img[@alt='United States']")
	WebElement US;
	
	//searchElement
	@FindBy(xpath="//input[@id='gh-search-input']")
	WebElement Search;	
	
	//product
	@FindBy(xpath="//input[@id='gh-search-input']")
	WebElement search ;
	
	@FindBy(xpath="//button[@class='header-search-button']")
	WebElement enter;
	
	@FindBy(xpath="//img[@alt='Tineco - iFloor 3 Plus – 3 in 1 Mop, Vacuum & Self Cleaning Floor Washer - White and Gray - Front_Zoom']")
	WebElement cleaner;
	
	@FindBy(xpath="//button[@class='c-button c-button-primary c-button-lg c-button-block c-button-icon c-button-icon-leading add-to-cart-button']")
	WebElement AddCart;
	
	@FindBy(xpath="//a[@class='c-button c-button-secondary c-button-sm c-button-block ']")
	WebElement gotocard; 
	
	@FindBy(xpath="//span[contains(text(),'Added to cart')]")
	WebElement addedmsg;
	
	public SearchAddCartElement() {
		PageFactory.initElements(driver, this);
		clickElement(US);
		

	}
	public void search() {
		search.click();
		search.sendKeys("floorcleaner");
		enter.click();
		cleaner.click();
		AddCart.click();
		
	}
	
}
