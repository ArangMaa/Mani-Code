package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MANITA\\eclipse-workspace\\Selenium\\Browsers\\chromedriver.exe");

		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com/");//get method go to the URL and wait for page get uploaded, but navigate method is to navigae the  url with , back, refresh, forward all three for navgate
		
		String id=	driver.getWindowHandle();// how to capture the id- get window method will get the current browser id as there will be many browser
		System.out.println(id);
		
		//driver.navigate().to("https://www.facebook.com/");
		driver.navigate().back();// 
		driver.navigate().forward();
		driver.navigate().refresh();	
		driver.manage().window().maximize();//maximize the window
		driver.manage().deleteAllCookies();// delete all cookies
		
		String url= driver.getCurrentUrl();//get the current URL
		System.out.println(url);
		
		String title= driver.getTitle();// get the title of the application
		System.out.println(title);
		driver.quit();// terminate the complete browser
		
		
	
	
	
	
	 
		driver.quit();
	}

}
