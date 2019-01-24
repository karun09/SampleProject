package org.library;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	WebDriver driver ;
	
	public WebDriver getDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\KK_My Data\\Automation Testing\\Drivers\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		return driver;
	}

	public void loadUrl(String URL) {
		driver.get(URL);
		
		
	}
	public void type(WebElement element , String name)
	{
	element.sendKeys(name);
	}
	
	public void btnClick(WebElement element) {
		
		element.click();

	}
	
	public void quitBrowser() {
	driver.quit();
	}
}
