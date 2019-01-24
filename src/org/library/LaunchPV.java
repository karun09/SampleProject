package org.library;


import java.util.List;

import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
	
public class LaunchPV {
	
		public static void main(String[] args)  {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver","C:\\KK_My Data\\Automation Testing\\Drivers\\chromedriver_win32\\chromedriver.exe");
	        
	        WebDriver driver =  new ChromeDriver();
	        driver.get("https://pvtest.flex.com/planview/login/body.asp");
	        String title=driver.getTitle();
	        System.out.println(title);
	       String url= driver.getCurrentUrl();
	       System.out.println(url);
	             
	       WebElement domain= driver.findElement(By.name("DSN"));
	    	Select y= new Select(domain);
	       	y.selectByValue("integration");
	       	 WebElement txtuser=driver.findElement(By.id("Username"));
	       	 txtuser.sendKeys("gsskkaru");
	       	 WebElement txtpass = driver.findElement(By.id("UserPass"));
	       	 txtpass.sendKeys("flex");
	         WebElement btnlog = driver.findElement(By.id("btnLogin"));
	         btnlog.click();
	      //Time Sheet   	
	     WebElement txtnext= driver.findElement(By.id("TIME2"));
	      txtnext.click();
	     WebElement txtperiod= driver.findElement(By.id("pick-period"));
	      txtperiod.click();
	      WebElement col = driver.findElement(By.xpath("//*[@id=pick-period]/tbody/tr[1]/td[2]/a"));
	      col.click();
	     
		}
	}


