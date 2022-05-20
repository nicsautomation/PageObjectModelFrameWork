package pages;

import org.openqa.selenium.WebDriver;

public class Payment extends BasePage{

	public Payment(WebDriver driver) {
		super(driver);
	}
	
	String pymntByWxpath= "//a[@title ='Pay by bank wire']";
	String pymntByCxpath ="//a[@title ='Pay by check.']";
	
	public void paymentByWire() {
		clickWithXpath(pymntByWxpath);
	}
	public void paymentByCheque() {
		clickWithXpath(pymntByCxpath);
	}
}
