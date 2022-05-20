package pages;

import org.openqa.selenium.WebDriver;

public class WomenApparelPage extends BasePage {

	public WomenApparelPage(WebDriver driver) {
		super(driver);
	}
	
	String dressXpath ="//a[@class='product_img_link' and @title='Faded Short Sleeve T-shirts']";
	
	public void quickViewdress() {
		clickWithXpath(dressXpath);
	}
}
