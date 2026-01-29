package seleniumbasics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingFileUpload extends Base{
	
	public void fileUploadUsingSendKeys() {
		driver.navigate().to("https://demo.guru99.com/test/upload");
		WebElement fileupload = driver.findElement(By.id("uploadfile_0"));
		fileupload.sendKeys("C:\\Users\\Zartech\\git\\Selenium\\AutomationCourse\\src\\test\\resources\\FutureBlox.pdf");
		
		WebElement checkbox = driver.findElement(By.id("terms"));
		checkbox.click();
		
		WebElement submitbutton = driver.findElement(By.id("submitbutton"));
		submitbutton.click();
		
	}
	
	public void fileUploadUsingRobot() throws AWTException {
		
		driver.navigate().to("https://www.ilovepdf.com/pdf_to_word");
		WebElement uploadbutton = driver.findElement(By.id("pickfiles"));
		uploadbutton.click();
		StringSelection string = new StringSelection("C:\\Users\\Zartech\\git\\Selenium\\AutomationCourse\\src\\test\\resources\\FutureBlox.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(string, null);
		
		Robot robot = new Robot();
		robot.delay(2500);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
	}

	public static void main(String[] args) {
		HandlingFileUpload fileupload = new HandlingFileUpload();
		fileupload.initialiseBrowser();
		//fileupload.fileUploadUsingSendKeys();
		try {
			fileupload.fileUploadUsingRobot();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
