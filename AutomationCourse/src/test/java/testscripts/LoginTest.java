package testscripts;


import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pages.LoginPage;
import seleniumbasics.TestNGBase;
import utilities.ExcellUtility;

public class LoginTest extends TestNGBase {
	@Test
	public void verifyUserLoginWithValidCredentials() throws IOException {
		
		//WebElement username = driver.findElement(By.xpath("//input[@id='user-name']"));
		//username.sendKeys("standard_user");
		
		//WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		//password.sendKeys("secret_sauce");
		
		//WebElement login = driver.findElement(By.xpath("//input[@id='login-button']"));
		//login.click();
		String usernamevalue = ExcellUtility.getStringData(0, 0, "LoginPage");
		String passwordvalue = ExcellUtility.getStringData(0, 1, "LoginPage");
		LoginPage login = new LoginPage(driver);
		login.enterUsernameOnUsernameField(usernamevalue);
		login.enterPasswordOnPasswordField(passwordvalue);
		login.clickOnLoginButton();
		
	}
	@Test
public void verifyUserLoginWithValidUsernameAndInvalidPassword() throws IOException {
		String usernamevalue = ExcellUtility.getStringData(1, 0, "LoginPage");
		String passwordvalue = ExcellUtility.getStringData(1, 1, "LoginPage");
		LoginPage login = new LoginPage(driver);
		login.enterUsernameOnUsernameField(usernamevalue);
		login.enterPasswordOnPasswordField(passwordvalue);
		login.clickOnLoginButton();	
		
		
	}
	
	@Test
public void verifyUserLoginWithInvalidUsernameAndValidPassword() throws IOException {
		
		String usernamevalue = ExcellUtility.getStringData(2, 0, "LoginPage");
		String passwordvalue = ExcellUtility.getStringData(2, 1, "LoginPage");
		LoginPage login = new LoginPage(driver);
		login.enterUsernameOnUsernameField(usernamevalue);
		login.enterPasswordOnPasswordField(passwordvalue);
		login.clickOnLoginButton();
		
	}
	
	@Test
public void verifyUserLoginWithInvalidCredential() throws IOException {
		
		String usernamevalue = ExcellUtility.getStringData(3, 0, "LoginPage");
		String passwordvalue = ExcellUtility.getStringData(3, 1, "LoginPage");
		LoginPage login = new LoginPage(driver);
		login.enterUsernameOnUsernameField(usernamevalue);
		login.enterPasswordOnPasswordField(passwordvalue);
		login.clickOnLoginButton();
	}
	

}
