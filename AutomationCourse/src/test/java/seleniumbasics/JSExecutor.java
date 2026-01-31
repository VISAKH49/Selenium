package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class JSExecutor extends Base{
	
	public void verifyJSExecutor() {
		
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		driver.manage().window().minimize();
		WebElement showmsg = driver.findElement(By.id("button-one"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click;", showmsg);
		js.executeScript("window.scrollBy(0,350)", " ");
		
	}

	public static void main(String[] args) {
		JSExecutor jse = new JSExecutor();
		jse.initialiseBrowser();
		jse.verifyJSExecutor();
		

	}

}
