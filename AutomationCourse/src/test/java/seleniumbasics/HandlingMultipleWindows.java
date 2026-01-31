package seleniumbasics;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingMultipleWindows extends Base {

	public void verifyMultipleWindows() {
		
		driver.navigate().to("https://demo.guru99.com/popup.php");
		String parentWindow = driver.getWindowHandle();
		System.out.println(parentWindow);
		
		WebElement click = driver.findElement(By.xpath("//a[text()='Click Here']"));
		click.click();
		
		Set<String>HandleIds = driver.getWindowHandles();
		System.out.println(HandleIds);
		
		Iterator<String>it = HandleIds.iterator();
		while(it.hasNext())
		{
			String currentId = it.next();
			if(!currentId.equals(parentWindow))
			{
				driver.switchTo().window(currentId);
			
			WebElement mailId = driver.findElement(By.xpath("//input[@name='emailid']"));
			mailId.sendKeys("test@gmail.com");
			WebElement submit = driver.findElement(By.xpath("//input[@name='btnLogin']"));
			submit.click();
		    }
		}
	}
	public static void main(String[] args) {
		
		HandlingMultipleWindows window = new HandlingMultipleWindows();
		window.initialiseBrowser();
		window.verifyMultipleWindows();
		

	}

}
