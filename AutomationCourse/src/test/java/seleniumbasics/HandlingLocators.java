package seleniumbasics;

import org.openqa.selenium.By;

public class HandlingLocators extends Base{
	public void verifyLocators() {
		driver.findElement(By.id("button-one"));
		driver.findElement(By.tagName("button"));
		driver.findElement(By.name("description"));
		driver.findElement(By.className("form-control"));
		driver.findElement(By.linkText("Simple Form Demo"));
		driver.findElement(By.partialLinkText("Simple"));
		driver.findElement(By.cssSelector("button[id='button-one']"));
		driver.findElement(By.xpath("//input[@id='single-input-field']"));
		driver.findElement(By.xpath("//button[text()='Show Message']"));
		driver.findElement(By.xpath("//button[@type='button' and @id='button-one']"));
		driver.findElement(By.xpath("//button[@id='button-one' or @id='button-one-electronics']"));
		driver.findElement(By.xpath("//div[contains(text(),'Single Input Field')]//parent::div[@class='card']"));
		driver.findElement(By.xpath("//div[@class='card']//child::button[@id='button-one']"));
		driver.findElement(By.xpath("//button[@id='button-one']//following::div[@class='card']"));
		driver.findElement(By.xpath("//button[@id='button-one']//preceding::div[@class='card']"));
		driver.findElement(By.xpath("//button[@id='button-one']//ancestor::div"));
		driver.findElement(By.xpath("//div[@class='card']//descendant::div"));
		
		///html/body/section/div/div/div[2]/div[1]/div/div[2]/form/button
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
