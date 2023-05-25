package testCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import baseDriver.BaseClass;

public class BottonLinkElement extends BaseClass {
	@FindBy(xpath = "//img[@alt='United States']")
	WebElement US;

	@FindBy(xpath = "//button[@class='c-button-unstyled hamburger-menu-button']")
	WebElement menu;

	@FindBy(xpath = "//a[contains(text(),'Terms & Conditions')]")
	WebElement term;
	 
	@FindBy(xpath = "//a[contains(text(),'Schedule a Service')]")
	WebElement services;
	
	
	
	public BottonLinkElement() {
		PageFactory.initElements(driver, this);
		clickElement(US);
		
	}

	public void allbottonlink() {

		int linksCount = 0;

		List<WebElement> allLinks = driver
				.findElements(By.xpath("//div[@class='main-navigation grid grid-cols-3 auto-flow-col']"));
		linksCount = allLinks.size();

		for (int i = 1; i <= allLinks.size(); i = i + 1) {
			List<WebElement> linksfinal = driver.findElements(By.tagName("a"));
			System.out.println(linksfinal.size());
			for (int j = 1; j <= linksfinal.size(); j = j + 1) {
				System.out.println(linksfinal.get(i).getText());
				
			}

		}
		
	}
		public void terms() {

			clickElement(term);
			
			
		}
		public void services() {

			clickElement(services);			
			
		}

}
