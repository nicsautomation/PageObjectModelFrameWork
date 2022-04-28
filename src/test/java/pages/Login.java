package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {

	WebDriver driver;
	public Login(WebDriver driver) {
		this.driver = driver;
	}

	String enterUserNameXpath = "//input[@id='login-username']";
	
	public void enterUserName(String strUserName) throws InterruptedException {
		driver.findElement(By.xpath(enterUserNameXpath)).sendKeys(strUserName);
		Thread.sleep(10000);
	}
}
