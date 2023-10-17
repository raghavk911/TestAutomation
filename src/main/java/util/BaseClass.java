package util;

import java.awt.AWTException;
import java.awt.HeadlessException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class BaseClass extends DriverFactory{
	public static void launchBrowser(String webDriverObject) {
		DriverFactory.getBrowser(webDriverObject);
	}
	
	public static File getScreenshotFolder(String portal, String module){
		File DestFile=new File("D:\\Raghav\\Eclipse\\GmailLogIn\\ScreenShot");
		@SuppressWarnings("unused")
		boolean bool=DestFile.mkdirs();
		return DestFile;
		
	}
	
	public static void getScreenShot(String portal, String module, String testCaseName) throws HeadlessException, AWTException, IOException {
		BufferedImage image =new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
		File path=BaseClass.getScreenshotFolder(portal, module);
		File f=new File(path+"\\"+".png");
		f.createNewFile();
		ImageIO.write(image, "png", f);
	}
}
