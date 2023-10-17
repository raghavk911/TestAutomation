package testCase;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import WebElement.GmailWebElement;
import util.BaseClass;

public class TC004_VerifyTheForgotPasswordFunctionality {
	@Test
	public void tC004_VerifyTheForgotPasswordFunctionality() {
		GmailWebElement gmwe;
		
		try {
			BaseClass.launchBrowser("GmailDriver");
			gmwe = new GmailWebElement();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	@AfterTest
	public void quitBrowser() {
		BaseClass.driver.quit();
	}
}
