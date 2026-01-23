package seleniumbasics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HandlingActions extends Base {
	
	public void verifyRightClick() {
		WebElement rightclick = driver.findElement(By.xpath("//a[@id='others']"));
		Actions actions = new Actions(driver);
		actions.contextClick(rightclick).build().perform();
		
	}
	
	public void verifyMouseHover() {
		WebElement rightclick = driver.findElement(By.xpath("//a[@id='others']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(rightclick).build().perform();
		
	}
	
	public void dragAndDrop() {
		
	    driver.navigate().to("https://demoqa.com/droppable");
		WebElement drag = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement drop = driver.findElement(By.xpath("//div[@id='droppable']"));
		Actions action = new Actions(driver);
		action.dragAndDrop(drag, drop).build().perform();
		
	}
	
	public void verifyKeyBoardAction() throws AWTException {
		
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_T);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_T);
		
	}

	public static void main(String[] args) {
		HandlingActions action = new HandlingActions();
		action.initialiseBrowser();
		//action.verifyRightClick();
		//action.verifyMouseHover();
		//action.dragAndDrop();
		try {
			action.verifyKeyBoardAction();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
