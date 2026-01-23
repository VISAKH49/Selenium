package seleniumbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingFrames extends Base {
	
	public void verifyFrames() {
		
		driver.navigate().to("https://demoqa.com/frames");
		List<WebElement>totalframe = driver.findElements(By.tagName("iframe"));
		System.out.println(totalframe.size());
		
		WebElement frame = driver.findElement(By.id("frame1"));
		driver.switchTo().frame(frame);
		
		WebElement frameText = driver.findElement(By.id("sampleHeading"));
		System.out.println(frameText.getText());
		
		//back to default page
		//driver.switchTo().defaultContent();
		
		
	}

	public static void main(String[] args) {
		
		HandlingFrames frame = new HandlingFrames();
		frame.initialiseBrowser();
		frame.verifyFrames();
		

	}

}
