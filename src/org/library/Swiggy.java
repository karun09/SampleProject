package org.library;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swiggy {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\KK_My Data\\Automation Testing\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.swiggy.com/");
		WebElement btnsign = driver.findElement(By.xpath("//a[@class='r2iyh']"));
		btnsign.click();
		WebElement txtmobile = driver.findElement(By.xpath("//input[@id='mobile']"));
		txtmobile.sendKeys("9809088900");
		WebElement txtname = driver.findElement(By.xpath("(//input[@class='_381fS'])[2]"));
		txtname.sendKeys("Rajesh");
		WebElement txtemail = driver.findElement(By.xpath("//input[@id='email']"));
		txtemail.sendKeys("rajesh.mail@yahoo.com");
		WebElement txtpass = driver.findElement(By.xpath("//input[@id='password']"));
		txtpass.sendKeys("swift@09");
		WebElement btnsgn = driver.findElement(By.xpath("//a[@class='a-ayg']"));
		btnsgn.click();
		
				}

}
