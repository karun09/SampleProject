package org.library;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
	
	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\KK_My Data\\Automation Testing\\Drivers\\chromedriver_win32\\chromedriver.exe");
        
        WebDriver driver =  new ChromeDriver();
        driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
        //String title=driver.getTitle();
        //System.out.println(title);
       //String url= driver.getCurrentUrl();
       //System.out.println(url);
              
          WebElement txtNext=driver.findElement(By.xpath("//span[text()='Next']"));
    		 txtNext.click();
    		 WebElement txtpassword = driver.findElement(By.xpath("(//input[@class='whsOnd zHQkBf'])[1]"));
    		 txtpassword.sendKeys("");
    		// driver.quit();
    		 WebElement txtEnter=driver.findElement(By.xpath("(//span[@class='RveJvd snByac'])[1]"));
    		 txtEnter.click();
    		 
    		 WebElement txtsetting=driver.findElement(By.xpath("//span[@class='gb_cb gbii'])"));
    		 txtsetting.click();
      //Time Sheet   	
    // WebElement txtnext= driver.findElement(By.id("TIME2"));
      //txtnext.click();
     //WebElement txtperiod= driver.findElement(By.id("pick-period"));
      //txtperiod.click();
      //driver.findElement(By.xpath("(
	}
}
