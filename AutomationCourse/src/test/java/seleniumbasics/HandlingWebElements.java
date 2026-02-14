package seleniumbasics;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingWebElements extends Base {
	
	public void verifyWebElements()
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement messageBox = driver.findElement(By.xpath("//input[@id='single-input-field']"));
		messageBox.sendKeys("hii");
		
		WebElement showmsgButton = driver.findElement(By.xpath("//button[@id='button-one']"));
		System.out.println(showmsgButton.isDisplayed());
		System.out.println(showmsgButton.isEnabled());
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));//explicit wait
		wait.until(ExpectedConditions.elementToBeClickable(showmsgButton));
		Wait<WebDriver>fluentwait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(5))
		 .pollingEvery(Duration.ofSeconds(1)).ignoring(NoSuchElementException.class);//fluent wait
		fluentwait.until(ExpectedConditions.elementToBeClickable(showmsgButton));
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
