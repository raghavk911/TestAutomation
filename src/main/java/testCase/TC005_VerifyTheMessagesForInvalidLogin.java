package testCase;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import WebElement.GmailWebElement;
import util.BaseClass;

public class TC005_VerifyTheMessagesForInvalidLogin {
	@Test
	public void tC005_VerifyTheMessagesForInvalidLogin() {
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
