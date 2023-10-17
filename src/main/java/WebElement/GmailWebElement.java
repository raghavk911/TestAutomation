package WebElement;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import util.BaseClass;

/**
 * @methodname          enterEmailAddress
 * @TestClass           GmailWebElement
 * @author              Raghavendra Kadam
 * @description         This class performes WebElement creation activity.
 *                      It includes WebElement creation and browser automation methods activity.
 * @createddate         09-Oct-2023
 * * @modificationlog
 */
public class GmailWebElement {
	@FindBy(id="identifierId")
	public WebElement emailPhoneTextField;
	
	@FindBy(xpath="//utton[@class='VfPpkd-LgbsSe VfPpkd-LgbsSe-OWXEXe-k8QpJ VfPpkd-LgbsSe-OWXEXe-dgl2Hf nCP5yc AjY5Oe DuMIQc LQeN7 qIypjc TrZEUc lw1w4b']")
	public WebElement nextBtn;
	
	@FindBy(xpath="//span[normalize-space()='Sign in']")
	public WebElement passowrdTextField;
	
	@FindBy(className="VfPpkd-RLmnJb")
	public WebElement nextPasswordBtn;
	
	public GmailWebElement()
	{
		PageFactory.initElements(BaseClass.driver, this);
	}

	public void emailPhoneTextField() {
		try {
			emailPhoneTextField.click();
			
			System.out.println("textField clicked");
		} catch (Exception e) {
			System.out.println("textField not clicked ::" + e.getMessage());
		}
	}
	
	/**
	   * @methodname            enterEmailAddress
	   * @author                Raghavendra Kadam
	   * @params                emailId contains Excel file data from TestCase Classes
	   * @description           This method Login to Salesforce website
	   * @return                void
	   */
	public void enterEmailAddress(String emailId){
		try {
			emailPhoneTextField.sendKeys(emailId);
			System.out.println("Enter Text Successfully");
			Reporter.log("Email Enter successfully");
		} catch (Exception e) {
			Reporter.log("Unable to enter email id"+ e.getMessage());
			e.printStackTrace();
		}
	}
	public void nextBtn() {
		try {
			nextBtn.click();
			System.out.println("Next button is clicked");
		} catch (Exception e) {
			System.out.println("Next button is clicked ::"+e.getMessage());
			try {
				BaseClass.getScreenShot("Gmail", "GmailLogin","nextBtn");
			} catch (Exception e2) {
				Reporter.log("Unable to get Screenshot ::"+ e2.getMessage());
			}
		}
	}
	
	public void passowrdTextField() {
		try {
			emailPhoneTextField.click();
			System.out.println("Passowrd Text Field clicked");
		} catch (Exception e) {
			System.out.println("Passowrd Text Field not clicked ::" + e.getMessage());
		}
	}
	
	public void nextPasswordBtn() {
		try {
			nextBtn.click();
			System.out.println("Next Password button is clicked");
		} catch (Exception e) {
			System.out.println("Next Password button is clicked ::"+e.getMessage());
		}
	}
}