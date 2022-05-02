package pages;

import org.openqa.selenium.WebDriver;

public class Login extends BasePage{

	public Login(WebDriver driver) {
		super(driver);
	}
	
	String enterUserNameXpath = "//input[@id='email']";
	String enterPasswordXpath = "//input[@id='passwd']";
	String signInXpath = "//i[@class='icon-lock left']";

	public void enterUserName(String strUserName) throws InterruptedException {
		sendKeysWithXpath(enterUserNameXpath, strUserName);

	}


	public void enterPassword(String strPassword) throws InterruptedException {
		sendKeysWithXpath(enterPasswordXpath, strPassword);
	}
	
	
	public void clickSignIn() throws InterruptedException {
		clickWithXpath(signInXpath);
	}
}

// System.getpro