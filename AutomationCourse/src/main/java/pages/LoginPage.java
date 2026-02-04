package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
		
	}
	@FindBy(xpath="//input[@id='user-name']")WebElement username;
	@FindBy(xpath="//input[@id='password']")WebElement password;
	@FindBy(xpath="//input[@id='login-button']")WebElement loginbutton;
	
	
	
	
	public void enterUsernameOnUsernameField(String usernamevalue) {
		username.sendKeys(usernamevalue);
			
	}
	
	public void enterPasswordOnPasswordField(String passwordvalue) {
		password.sendKeys(passwordvalue);
		
	}
	 public void clickOnLoginButton() {
		 loginbutton.click();
		
	}

}
