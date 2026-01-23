package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropDown extends Base {
public void verifyDropdown()
{
	driver.navigate().to("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
	WebElement dropdown1 = driver.findElement(By.id("dropdowm-menu-1"));
	//object creation for predefined class'select'
	Select select = new Select(dropdown1);
	//select by index value
	//select.selectByIndex(2);
	
	//select by value
	//select.selectByValue("c#");
	
	//select by visibletext
	//select.selectByVisibleText("SQL");
}

public void verifyCheckBox() 
{
	driver.navigate().to("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
	WebElement checkbox = driver.findElement(By.xpath("//input[@value='option-1']"));
	System.out.println(checkbox.isSelected());
	checkbox.click();
	//System.out.println(checkbox.isSelected());
	//deselection
	//checkbox.click();
	
    	
}

public void verifyRadioButton() {
	driver.navigate().to("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
	WebElement radio = driver.findElement(By.xpath("//input[@value='orange']"));
	radio.click();
	
	WebElement radio1 = driver.findElement(By.xpath("//input[@value='blue']"));
	radio1.click();
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HandlingDropDown drop = new HandlingDropDown();
		drop.initialiseBrowser();
		//drop.verifyDropdown();
		drop.verifyCheckBox();
		//drop.verifyRadioButton();

	}

}
