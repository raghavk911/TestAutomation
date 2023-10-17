package testCase;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import WebElement.GmailWebElement;
import util.BaseClass;

public class TC006_VerifyTheRememberMeFunctionality {
	@Test
	public void tC006_VerifyTheRememberMeFunctionality() {
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
