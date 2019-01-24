package org.library;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelPractise {
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\KK_My Data\\Automation Testing\\Drivers\\chromedriver_win32\\chromedriver.exe");
        
        WebDriver driver =  new ChromeDriver();
        driver.get("https://www.facebook.com/");
        String title=driver.getTitle();
        System.out.println(title);
       String url= driver.getCurrentUrl();
       System.out.println(url);
       	WebElement txtuser =driver.findElement(By.id(("u_0_j")));
       	txtuser.sendKeys("Rajesh");
       	
       	WebElement txtpass =driver.findElement(By.id("u_0_l"));
       	txtpass.sendKeys("Kumar");
       	
       	WebElement txtenter=driver.findElement(By.id("u_0_o"));
       	txtenter.sendKeys("rajeshkumar1234@yahoo.com");
       	
     	WebElement txtenter1=driver.findElement(By.id("u_0_r"));
       	txtenter1.sendKeys("rajeshkumar1234@yahoo.com");
       	WebElement txtpass1=driver.findElement(By.id("u_0_v"));
       	txtpass1.sendKeys("Jaquar@123");
       	WebElement txtdy=driver.findElement(By.id("day"));
       	Select s=new Select(txtdy);
       	s.selectByIndex(10);
      WebElement txtmont=driver.findElement(By.id("month"));
       	Select n=new Select(txtmont);
       	n.selectByIndex(5);
       	WebElement txtyear=driver.findElement(By.id("year"));
       	Select y= new Select(txtyear);
       	y.selectByIndex(12);
       	WebElement txtrd=driver.findElement(By.id("u_0_a"));
       				txtrd.click();
       	
       	WebElement sign=driver.findElement(By.id("u_0_11"));
       	sign.click();
       	
       	
       	
       	
       	
       	
       	
	}
}



