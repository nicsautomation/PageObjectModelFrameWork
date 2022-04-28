package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class HomePage {

	WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	String xpathSignInButton = "//div[@class='_yb_p43e1']//a[text()='Sign in']";
	
	public void clickSignIn() {
		driver.findElement(By.xpath(xpathSignInButton)).click();
	}
	  
}
