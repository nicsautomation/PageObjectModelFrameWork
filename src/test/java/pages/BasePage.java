package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasePage {

	WebDriver driver;

	
	public BasePage(WebDriver driver) {
		this.driver = driver;
	}
	public void clickWithXpath(String xPath){

		driver.findElement(By.xpath(xPath)).click();
	}


	public void sendKeysWithXpath(String xPath , String value){

		driver.findElement(By.xpath(xPath)).sendKeys(value);;
	}
	
	public String getTextWithXpath(String xPath){

		return driver.findElement(By.xpath(xPath)).getText();
		
		
	}


}
