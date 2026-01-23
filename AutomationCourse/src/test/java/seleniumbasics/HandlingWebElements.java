package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingWebElements extends Base {
	
	public void verifyWebElements()
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement messageBox = driver.findElement(By.xpath("//input[@id='single-input-field']"));
		messageBox.sendKeys("hii");
		
		WebElement showmsgButton = driver.findElement(By.xpath("//button[@id='button-one']"));
		System.out.println(showmsgButton.isDisplayed());
		System.out.println(showmsgButton.isEnabled());
		showmsgButton.click();
		
		WebElement textMessage = driver.findElement(By.id("message-one"));
		System.out.println(textMessage.getText());
		messageBox.clear();
		System.out.println(showmsgButton.getCssValue(("background-color")));
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HandlingWebElements webelement = new HandlingWebElements();
		webelement.initialiseBrowser();
		webelement.verifyWebElements();

	}

}
