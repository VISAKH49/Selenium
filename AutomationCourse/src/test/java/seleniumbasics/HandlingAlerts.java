package seleniumbasics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingAlerts extends Base {
	
	public void verifySimpleAlerts() {
		
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement simplealert = driver.findElement(By.xpath("//button[@id='alertButton']"));
		simplealert.click();
		Alert al = driver.switchTo().alert();
		al.accept();
		
	}
public void verifyConfirmAlerts() {
		
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement confirmalert = driver.findElement(By.id("confirmButton"));
		confirmalert.click();
		Alert al = driver.switchTo().alert();
		al.accept();
		
	}
public void verifyPromptAlerts() {
	
	driver.navigate().to("https://demoqa.com/alerts");
	WebElement promptalert = driver.findElement(By.xpath("//button[@id='promtButton']"));
	promptalert.click();
	Alert al = driver.switchTo().alert();
	al.sendKeys("hii");
	al.accept();
	
}

	public static void main(String[] args) {
		HandlingAlerts alert = new HandlingAlerts();
		alert.initialiseBrowser();
		//alert.verifySimpleAlerts();                                                                         
		//alert.verifyConfirmAlerts();
		alert.verifyPromptAlerts();

	}

}
