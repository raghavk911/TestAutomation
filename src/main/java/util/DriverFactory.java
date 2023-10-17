package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {
	public static WebDriver driver = null;
	public static WebDriver getBrowser(String webDriverObject) {
		
		if(webDriverObject =="GmailDriver") {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.get("https://accounts.google.com/v3/signin/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ifkv=AYZoVhchYPRxlbCspYA9ICNMCDUaPvW0hxGj_SKuW-WnRhDb1A-Lu0DHUITJWOmWRISyFnnjwDyh5w&rip=1&sacu=1&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin&dsh=S-1426035539%3A1696743046275942&theme=glifhttps://accounts.google.com/v3/signin/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ifkv=AYZoVhchYPRxlbCspYA9ICNMCDUaPvW0hxGj_SKuW-WnRhDb1A-Lu0DHUITJWOmWRISyFnnjwDyh5w&rip=1&sacu=1&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin&dsh=S-1426035539%3A1696743046275942&theme=glif");
			driver.manage().window().maximize();
			/*driver.findElement(By.id("identifierId")).sendKeys("raghavendra.k@deciphercloud.com.com");
			driver.findElement(By.id("password")).sendKeys("decipher@100");
			driver.findElement(By.id("Login")).click();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;*/
		}
		return driver;

	}
	
}