package pages;

import org.openqa.selenium.WebDriver;

public class SignInPage extends BasePage {

	public SignInPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
    String enterUserNameXpath = "//input[@id='email']";
    String enterPasswordXpath = "//input[@id='passwd']";
    String signInXpath = "//i[@class='icon-lock left']";

    public void enterUserName(String strUserName) throws InterruptedException {
        sendKeysWithXpath(enterUserNameXpath, strUserName);

    }


  /*  public void enterPassword(String strPassword) throws InterruptedException {
        sendKeysWithXpath(enterPasswordXpath, strPassword);
    } */
    
    public void enterPassword() throws InterruptedException {
        sendKeysWithXpath(enterPasswordXpath, "abc123");
    } 
    
    
    public void clickSignIn() throws InterruptedException {
        clickWithXpath(signInXpath);
    }
}
