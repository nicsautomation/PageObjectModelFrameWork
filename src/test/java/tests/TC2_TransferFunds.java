package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.HomePage;
import testDataManagement.TestDataHandler;

public class TC2_TransferFunds extends BaseTest{
		
	@Test(groups = {"sanity1"})
	public void transferFunds() throws InterruptedException {
		System.out.println(TestDataHandler.tC2_TransferFundsData.getStrPassWord());
		//hp.clickSignIn();
		//login.enterUserName(TestDataHandler.tc1_LoginIntoTheApplicationData.getStrUserName());
		//extent.createTest("TC1_LoginIntoTheApplication").log(Status.PASS, "testcase got passed");	
	}
}
