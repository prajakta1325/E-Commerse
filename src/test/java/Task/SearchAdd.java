package Task;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SearchAdd {
	@Test
	public void SerchforElement() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.bestbuy.com/");
		WebElement country = driver.findElement(By.xpath("//img[@alt='United States']"));
		country.click();
		
//	WebElement Accountlogin=driver.findElement(By.xpath("//span[@class='v-p-right-xxs line-clamp']"));
//	Accountlogin.click();
//	WebElement signup=driver.findElement(By.xpath("//a[contains(text(),'Sign In')]"));
//	signup.click();
//	WebElement email=driver.findElement(By.xpath("//input[@id='fld-e']"));
//	email.sendKeys("harshalvarpe000@gmail.com");
//	WebElement password=driver.findElement(By.xpath("//input[@id='fld-p1']"));
//	password.sendKeys("one+one=two");
//	WebElement login=driver.findElement(By.xpath("//button[@data-track='Sign In']"));
//	login.click();
		WebElement search = driver.findElement(By.xpath("//input[@id='gh-search-input']"));
		search.click();
		search.sendKeys("floorcleaner");
		WebElement enter = driver.findElement(By.xpath("//button[@class='header-search-button']"));
		enter.click();
		WebElement cleaner = driver.findElement(By.xpath("//img[@alt='Tineco - iFloor 3 Plus – 3 in 1 Mop, Vacuum & Self Cleaning Floor Washer - White and Gray - Front_Zoom']"));
		cleaner.click();
		WebElement AddCart = driver.findElement(By.xpath("//button[@class='c-button c-button-primary c-button-lg c-button-block c-button-icon c-button-icon-leading add-to-cart-button']"));
		AddCart.click();
		WebElement gotocard = driver.findElement(By.xpath("//a[@class='c-button c-button-secondary c-button-sm c-button-block ']"));
		gotocard.click();
		
	}
}
