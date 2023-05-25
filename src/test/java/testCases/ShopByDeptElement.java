package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import baseDriver.BaseClass;

public class ShopByDeptElement extends BaseClass{
	@FindBy(xpath="//img[@alt='United States']")
	WebElement US;
	
	@FindBy(xpath="//button[@aria-controls='flyout-container']")
	WebElement menu;
	
	@FindBy(xpath="//button[contains(text(),'Appliances')]")
	WebElement appliances;
	
	@FindBy(xpath="//button[contains(text(),'Washers & Dryers')]")
	WebElement Washer_drayer;
	
	@FindBy(xpath="//a[contains(text(),'Front-Loading Washers')]")
	WebElement FrontLoad;
	
	@FindBy(xpath="(//img[@alt='LG - 4.5 Cu. Ft. High Efficiency Stackable Front-Load Washer with 6Motion Technology - White - Front_Zoom'])[1]")
	WebElement img;
	
	@FindBy(xpath="//button[@data-button-state='ADD_TO_CART']")
	WebElement addtocart;
	
	@FindBy(xpath="//span[@class='added-to-cart']")
	WebElement addedmsg;
	
	public ShopByDeptElement() {
		PageFactory.initElements(driver, this);
		clickElement(US);
		

	}
	public void search() throws Exception {
		menu.click();
		clickElement(appliances);
		clickElement(Washer_drayer);
		clickElement(FrontLoad);
		clickElement(img);
		clickElement(addtocart);
		 WebElement ele = (new WebDriverWait(driver, 10)).until(ExpectedConditions
	                .visibilityOfElementLocated(By
	                        .xpath("//span[@class='added-to-cart']")));
		//Thread.sleep(2000);
	}
}
