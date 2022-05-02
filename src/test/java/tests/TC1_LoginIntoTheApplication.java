package tests;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.aventstack.extentreports.Status;
import testDataManagement.TestDataHandler;


public class TC1_LoginIntoTheApplication extends BaseTest{
	
	@Test(groups = "sanity")
	public void loginIntoTheApplication() throws InterruptedException, IOException {	
		hp.clickSignInUrl();
		login.enterUserName(TestDataHandler.tc1_LoginIntoTheApplicationData.getStrUserName());
		login.enterPassword(TestDataHandler.tc1_LoginIntoTheApplicationData.getStrUserName());
		login.clickSignIn();
		Assert.assertTrue(myAccount.getTextFromMyAccount().equalsIgnoreCase("My account"), "Error msg occured when getting my account text");
	}
}



//Parallel execution
// Sauce Labs
//Grid
// jenkins , Git
// environment variable
// Mutithreading thread local
