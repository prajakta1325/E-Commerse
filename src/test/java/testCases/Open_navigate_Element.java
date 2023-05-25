package testCases;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseDriver.BaseClass;

public class Open_navigate_Element extends BaseClass {

	@FindBy(xpath = "//img[@alt='United States']")
	WebElement US;

	@FindBy(xpath = "//button[@aria-label='Menu']")
	WebElement menu;

	@FindBy(xpath = "//button[contains(@class,'c-button-unstyled top-four v-fw-medium')]")
	WebElement allmenu;
	
	@FindBy(xpath = "(//button[@class='c-button-unstyled top-four v-fw-medium'])[1]")
	WebElement deals;
	
	@FindBy(xpath = "//button[contains(text(),'Featured')]")
	WebElement featured;
	
	@FindBy(xpath = "//a[contains(text(),'LEGO Toys')]")
	WebElement toys;
	
	@FindBy(xpath = "(//a[contains(text(),'Gift Ideas')])[1]")
	WebElement gift;
	
	String actualtitle_top ="Top Deals and Featured Offers on Electronics - Best Buy";
	String actualTitle_support ="Best Buy Support & Customer Service";
	String actualTitle_brand ="Insignia, Rocketfish, Dynex, Platinum and Modal - Best Buy";
	String actualTitle_feature ="Asian American Pacific Islander Heritage Month";
	
	public Open_navigate_Element() {
		PageFactory.initElements(driver, this);
		clickElement(US);

	}
//
//	public void navigate() throws Exception {
//
//		menu.click();
//		
//		int linksCount=0;
//		String[] links = null;
////		Map<String, String> expectedTitle = new HashMap<String, String>();
////		expectedTitle.put("Deals", driver.getTitle());
////		expectedTitle.put("Support & Services", driver.getTitle());
////		expectedTitle.put("Brands", driver.getTitle());
////		expectedTitle.put("Featured", driver.getTitle());
//		
//		List<WebElement> allLinks = driver
//				.findElements(By.xpath("//*[@class='hamburger-menu-flyout-list']//li[@class='liDropdownList ']"));
//
//		linksCount = allLinks.size();
//		System.out.println("Total no of links Available: "+linksCount);
//		
//		links= new String[linksCount];
//		// Traversing through the list and printing its text along with link address
//		for (WebElement link : allLinks) {
//		
//		link.click();
//		String text = link.getText();
//		Thread.sleep(2000);
//		
//		List<WebElement> nextallLinks = driver.findElements(By.xpath("//div[contains(@class,'hamburger-menu-flyout-list-item-wrapper')]//li/a"));
//
//		for (WebElement link1 : nextallLinks) {
//			Actions action = new Actions(driver);
//			action.moveToElement(link1).click();
//			
//					Thread.sleep(2000);
//		
//		
//		String ActualTitle = driver.getTitle();
//		String expectedTitle1 = expectedTitle.get(text);
//	
//		break;
//		
//		}
//		
//			System.out.println(link.getText());
//
//		}// ********** not able click deals and all url and getTitle
//	}
	public void single() throws Exception {

		clickElement(menu);
		clickElement(deals);
		clickElement(gift);
		Thread.sleep(2000);
		
		// ********** not able click deals and all url and getTitle
	}
	public void mm() {

		clickElement(menu);
		clickElement(featured);
		clickElement(toys);
		
		// ********** not able click deals and all url and getTitle
	}
}
