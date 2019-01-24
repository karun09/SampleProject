package org.library;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Sample {

	public static void main(String[] args) {
		
		Base b=new Base();
		WebDriver driver = b.getDriver();
		
		b.loadUrl("www.facebook.com");
		
		WebElement txtemail = driver.findElement(By.id("email"));
		b.type(txtemail, "karun@gmail.com");
	}
}
