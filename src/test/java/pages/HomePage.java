package pages;

import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{

	WebDriver driver;
	
	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	String xpathSignInButton = "//a[@class='login']";
	
	public void clickSignInUrl() {
		clickWithXpath(xpathSignInButton);
	}
	  
}
