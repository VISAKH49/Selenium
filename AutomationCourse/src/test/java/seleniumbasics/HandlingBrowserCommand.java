package seleniumbasics;

public class HandlingBrowserCommand extends Base {
	
	public void verifyBrowserCommand()
	{
		String title = driver.getTitle();
		System.out.println(title);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		String sourceCode = driver.getPageSource();
		System.out.println(sourceCode);
		String handleID = driver.getWindowHandle();
		System.out.println(handleID);
	}
	
	public void verifyNavigationCommand()
	{
		driver.navigate().to("https://www.allianz.com/en.html");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HandlingBrowserCommand browser = new HandlingBrowserCommand();
		browser.initialiseBrowser();
		//browser.verifyBrowserCommand();
		browser.verifyNavigationCommand();

	}

}
