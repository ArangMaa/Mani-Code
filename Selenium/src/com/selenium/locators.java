package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class locators {

	public static void main(String[] args) {
		// there are total 8 locators -id,name,classname,tagname,linktext, partiallinktext, xpath=
		///By is abstract class but in that all methods are available are static method
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\MANITA\\eclipse-workspace\\Selenium\\Browsers\\geckodriver.exe");
		
		WebDriver driver= new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		 //WebElement email=driver.findElement(By.id("email"));// find element is going to return webelement hence we have stored that in email
		//email.sendKeys("something.abc@qwerty.com");// 
		
		//WebElement pwd= driver.findElement(By.name("pass"));// locator is used is name
		//pwd.sendKeys("1234567890");//
		
		//WebElement firstName=driver.findElement(By.className("inputtext _55r1 _6luy"));Class Name is not preferable because in one class many web element as provided bocause of which it gave error for element not found
		
		//firstName.sendKeys("Manita...");
		//driver.quit();
		
		//WebElement forgottenAccount= driver.findElement(By.linkText("Forgotten password?"));//link text
			//	forgottenAccount.click();


		WebElement forgottenAccount= driver.findElement(By.partialLinkText("password?"));//Partial link text is used to partial value of any link becaus it is having lengthy text but that word should unique in that web page
		forgottenAccount.click();
		driver.close();
				
				
		
	}

}
