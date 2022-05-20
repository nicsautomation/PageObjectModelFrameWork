package pages;

import org.openqa.selenium.WebDriver;

public class ShoppingCart extends BasePage {

	public ShoppingCart(WebDriver driver) {
		super(driver);
	}
	
	String summaryTextXpath = "//h1[@class ='page-heading']";
	String proceedToAddressXPath = "//a[@class ='button btn btn-default standard-checkout button-medium']";
	String proceedShippingXpath ="//button[@class ='button btn btn-default button-medium']";
	String checkedBoxXpath ="//input[@id='cgv']";
	String proccedToPaymentXpath="//button[@class ='button btn btn-default standard-checkout button-medium']";
	
	public String getTextFromSummary() {
        return getTextWithXpath(summaryTextXpath);
    }
	
	public void ProceedToAddress() {
		clickWithXpath(proceedToAddressXPath);
	}
	
	public void ProceedToShipping() {
		clickWithXpath(proceedShippingXpath);
	}
	
	public void CheckedBoxAgree() {
		clickWithXpath(checkedBoxXpath);
	}
	
	public void proceedToPayment() {
		clickWithXpath(proccedToPaymentXpath);
	}
	
	
	
	

}
