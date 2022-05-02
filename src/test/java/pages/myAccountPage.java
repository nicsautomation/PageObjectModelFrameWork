package pages;

import org.openqa.selenium.WebDriver;

public class myAccountPage extends BasePage{
	
	public myAccountPage(WebDriver driver) {
		super(driver);
	}
	
	String myAcccountXpath = "//h1[@class='page-heading']";
	
	public String getTextFromMyAccount() {
		return getTextWithXpath(myAcccountXpath);
	}

}
