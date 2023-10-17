package testCase;

import java.awt.AWTException;
import java.awt.HeadlessException;
import java.io.IOException;

import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import WebElement.GmailWebElement;
import util.BaseClass;
import util.ReadExcel;

public class TC001_VerifyInvalidUserName {
	@Test
	public void tC001_VerifyInvalidUserName() throws HeadlessException, AWTException, IOException {
		GmailWebElement gmwe;
		
		try {
			BaseClass.launchBrowser("GmailDriver");
			gmwe = new GmailWebElement();
			String eid=ReadExcel.readExcelValuesSheets("TestData", "TestCaseData", 0, 1);
			gmwe.enterEmailAddress(eid);
			gmwe.nextBtn();
		} catch (Exception e) {
			try {
				Reporter.log(e.getMessage());
				BaseClass.getScreenShot("Gmail", "GmailLogin","tC001_VerifyInvalidUserName");
			} catch (Exception e2) {
				Reporter.log("Unable to getScreenShot ::"+e.getMessage());
			}
			
		}
	}
	
	@AfterTest
	public void quitBrowser() throws InterruptedException {
		Thread.sleep(10000);
		//BaseClass.driver.quit();
	}
}
