package pages;

import org.openqa.selenium.WebDriver;

public class OrderSummaryPage extends BasePage {

	public OrderSummaryPage(WebDriver driver) {
		super(driver);
	}
	
	String ordrSumrytextXpath = "//h1[@class=\"page-heading\"]";
	String confirmOXpath = "//button[@class='button btn btn-default button-medium']";
	
	public String getTextFromOrderSummary() {
        return getTextWithXpath(ordrSumrytextXpath);
    }
	
	public void CorfirmOrder() {
		clickWithXpath(confirmOXpath);
	}
 
	
}
