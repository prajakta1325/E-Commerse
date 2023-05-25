package testCases;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseDriver.BaseClass;

public class BrandsMenuElement extends BaseClass{
	@FindBy(xpath="//img[@alt='United States']")
	WebElement US;
	
	@FindBy(xpath="//button[@aria-controls='flyout-container']")
	WebElement menu;
	
	@FindBy(xpath="//button[contains(text(),'Brands')]")
	WebElement brands;
	
	@FindBy(xpath="//a[contains(text(),'Sony')]")
	WebElement sony;
	
	@FindBy(xpath="//a[contains(text(),'Nikon')]")                         //for nikon code is remaning
	WebElement nikon;
	
	@FindBy(xpath="//a[contains(text(),'Shop Nikon mirrorless cameras')]")                         //for nikon code is remaning
	WebElement mirrorLess;
	
	@FindBy(xpath="//img[@alt='Nikon - Z 6 II 4k Video Mirrorless Camera (Body only) - Black - Front_Zoom']")
	WebElement camera;
	
	@FindBy(xpath="//a[@data-track='[context:widgetType=secondaryNavigation,linkContent=TV & Projectors,linkRegion=12 Column Row,linkPlacement=c1w1i1]']")
	WebElement tv;
	
	@FindBy(xpath="//a[@data-track='[context:widgetType=secondaryNavigation,linkContent=Sony OLED TVs,linkRegion=12 Column Row,linkPlacement=c1w1i1p2l2]']")
	WebElement sonyTV;
	
	@FindBy(xpath="(//button[@class='c-button c-button-primary c-button-sm c-button-block c-button-icon c-button-icon-leading add-to-cart-button'])[1]")
	WebElement add;
	
	@FindBy(xpath="//button[@data-button-state='ADD_TO_CART']")
	WebElement addtocart;
	
//	@FindBy(xpath="//span[contains(text(),'Added to cart')]")
//	WebElement addedmsg;
	
	public BrandsMenuElement() {
		PageFactory.initElements(driver, this);
		clickElement(US);
		

	}
	public void search() {
		menu.click();
		clickElement(brands);
		clickElement(sony);
		clickElement(tv);
		clickElement(sonyTV);
		clickElement(add);
		
	}
	
	public void searchcamera() {
		menu.click();
		clickElement(nikon);
		clickElement(brands);
	clickElement(mirrorLess);
	clickElement(camera);
	clickElement(addtocart);
	}
}
