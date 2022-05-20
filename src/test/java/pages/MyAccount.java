package pages;

import org.openqa.selenium.WebDriver;

public class MyAccount extends BasePage {

	public MyAccount(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
//    String myAcccountXpath = "//h1[@class='page-heading']";
    String womenXpath ="//a[@title='Women']";
    
/*    public String getTextFromMyAccount() {
        return getTextWithXpath(myAcccountXpath);
    } */
    
    public String getTextFromMyAccount(String myAcccountXpath) {
        return getTextWithXpath(myAcccountXpath);
    } 
    
    public void clickOnWomen() {
    	clickWithXpath(womenXpath);
    }

}
