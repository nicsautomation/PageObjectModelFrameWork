package tests;

import java.io.File;
import java.io.IOException;

import org.testng.annotations.Test;
import com.aventstack.extentreports.Status;
import testDataManagement.TestDataHandler;


public class TC1_LoginIntoTheApplication extends BaseTest{
	
	@Test(groups = "sanity")
	public void loginIntoTheApplication() throws InterruptedException, IOException {	
		System.out.println(TestDataHandler.tc1_LoginIntoTheApplicationData.getStrUserName());
		//hp.clickSignIn();
		//login.enterUserName(TestDataHandler.tc1_LoginIntoTheApplicationData.getStrUserName());
		//extent.createTest("TC1_LoginIntoTheApplication").log(Status.PASS, "testcase got passed");	
	}
}



//Parallel execution
// Sauce Labs
//Grid
// jenkins , Git
// environment variable
// Mutithreading thread local
