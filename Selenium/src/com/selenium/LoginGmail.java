package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginGmail {

	public static void main(String[] args) {


		System.setProperty("webdriver.gecko.driver", "C:\\Users\\MANITA\\eclipse-workspace\\Selenium\\Browsers\\geckodriver.exe");
		
		WebDriver driver= new FirefoxDriver();
		
		driver.get("https://accounts.google.com/signin/v2/identifier?hl=en&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		
		//driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		WebElement gmail= driver.findElement(By.id("identifierId"));
		gmail.sendKeys("manitakumari713@gmail.com");
		
		WebElement nxt= driver.findElement(By.className("VfPpkd-RLmnJb"));
		nxt.click();
		
		WebElement pwd = driver.findElement(By.xpath("//input [@type='password']"));
		pwd.sendKeys("Arangmaa@7700");
		
		
		WebElement nxt1= driver.findElement(By.className("VfPpkd-RLmnJb"));
		nxt1.click();
	}

}
