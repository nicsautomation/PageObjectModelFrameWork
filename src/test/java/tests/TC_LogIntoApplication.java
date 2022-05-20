package tests;

import org.testng.Assert;
import org.testng.annotations.Test;


import testDataManagement.TestDataHandler;

public class TC_LogIntoApplication extends Basetest {
	@Test
	public void logIntoApplication() throws InterruptedException {
			
				hp.clickSignInUrl();
			//	si.enterUserName(TestDataHandler.tc1_LoginIntoTheApplicationData.getStrUserName());
			//	si.enterPassword(TestDataHandler.tc1_LoginIntoTheApplicationData.getStrPassword());
				System.out.println(TestDataHandler.tc1_LoginIntoTheApplicationData.getStrUserName());
			//	si.enterPassword();
				System.out.println(TestDataHandler.tc1_LoginIntoTheApplicationData.getStrPassword());
			//	si.clickSignIn();
			//	Assert.assertTrue(account.getTextFromMyAccount(TestDataHandler.tc2_LoginIntoTheApplicationData.getStrMyAccountXPath()).equalsIgnoreCase("My account"), "Error msg");
			//	Assert.assertTrue(account.getTextFromMyAccount().equalsIgnoreCase("My account"), "Error msg");
//				account.clickOnWomen();
//				womenA.quickViewdress();
//				atocart.addToCart();
//				atocart.proceedToCheckout();
//			//	Assert.assertTrue(scart.getTextFromSummary().equalsIgnoreCase("SHOPPING-CART SUMMARY"), "Error Msg on shopping summary");
//				scart.ProceedToAddress();
//				scart.ProceedToShipping();
//				scart.CheckedBoxAgree();
//				scart.proceedToPayment();
//				pay.paymentByCheque();
//				
//				Assert.assertTrue(odrsumry.getTextFromOrderSummary().equalsIgnoreCase("ORDER SUMMARY"), "Error Msg on order summary");
	}
}
