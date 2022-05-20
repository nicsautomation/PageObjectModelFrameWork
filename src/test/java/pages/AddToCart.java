package pages;

import org.openqa.selenium.WebDriver;

public class AddToCart extends BasePage {

	public AddToCart(WebDriver driver) {
		super(driver);
	}
	String addXpath = "//button[@class=\"exclusive\"]";
	String proceedXpath ="//a[@class='btn btn-default button button-medium']";
	
	public void addToCart() {
		clickWithXpath(addXpath);
	}
	
	public void proceedToCheckout() {
		clickWithXpath(proceedXpath);
	}
	
}
