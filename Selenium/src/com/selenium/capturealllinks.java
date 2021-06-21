package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class capturealllinks {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver","C:\\Users\\MANITA\\eclipse-workspace\\Selenium\\Browsers\\geckodriver.exe");
		
		WebDriver driver= new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		List<WebElement> allLinks =driver.findElements(By.tagName("a"));//list is concept of collection, collection is box where we can add anytype of objects but we can't add primitive data types
		//charactersticks of your list- lists, set, map
		//lists has Linked List, Array List, Vector
		//List is a collection which can holds any type of objects , and it always maintain in Insertion order means what ever order u are going to add object in same order it will me maintained
		// it is not going to sort is neither  it is going to change the order
		//It is index based which means all objects are saved with index and index starts with 0 
		//List can hold duplicate values and it can have any NUMBER OD NULL VALUSES.
		//easy to access data but manipulation will be difficult
		//many ways to access element from collections like, for loop, ForEach Loop,iterator,listIterator
		//System.out.println(allLinks.size());//t get the all links available on webpage
		// how to use forEach loop
		for (WebElement link:allLinks)
		{
			String linkText= link.getText();
			System.out.println(linkText);
			
			
		}
		
		//Xpath is used to find the element on the Webpage
		//Absolute xPath and Relative Xpath are two types
		//Absolute  xPath is address  of webelement from the root node considering open tags a parent tag is root node. start with single forward slash(/)
				//Relative is path of the element from the current node, it has  syntax //tagname[@aatribute='Value']
		
		
		//Absolut path
	//	String absXpath="/html/body/div/div/div/div/div/div/div/div/div/div/div/div/div/div/div/div/from/div/input";
		//WebElement absEmail=driver.findElement(By.xpath(absXpath));
		
		//Relative path
		WebElement Email= driver.findElement(By.xpath("//input[@id='email']"));
		Email.sendKeys("ankitdking3@gmail.com");
		
		//WebElement paddwrd= driver.findElement(By.xpath("//input[@id='pass'"));
		//paddwrd.sendKeys("Maa@7700");
		
		//WebElement button =driver.findElement(By.xpath("u_0_b"));
		//button.click();
		
		//WebElement createacct=driver.findElement(By.xpath("//a[@id='u_0_2']"));
		//createacct.click();
		
		//another way of relative path by using text() for text we don't write @
		
		//WebElement create text= driver.findElement(By.xpath("//span[text ='Create an account']")); this is used when some text is available to find that text we used  text method
		
		// Now by index and grouping when is used if we have so many same element with same class name than we used Index no
		
		// as per logic index statrt from 0 but as per program prespective index starts from 1
		
		//WebElement mobile= driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[3]"));
		//mobile.sendKeys("789613941663");
		
		//types of relative xpaths are using contain()and starts-with() method it can be applied for both text method n value pair method
		
		WebElement starttext= driver.findElement(By.xpath("//h2[starts-with(text(),'Facebook helps')]"));
		System.out.println(starttext.getText());
		
		//difference betwen contains method and Starts-with method
		//contains method will match the string from wherever it is in the web page. be it at beetween or start or be it at end
		//but Starts-with method will only check from starting points
		
		//WebElement cont=driver.findElement(By.xpath("//h2[contains(text(),'people in your life')]"));
		//System.out.println(cont.getText());
		
		//Css was used when IE browser was too sloe to find xpath
		// syntax- tagename[attr='value']
		
		WebElement startext= driver.findElement(By.cssSelector("input[id='email']"));
		System.out.println(starttext.getText());
		
		
		//driver.quit();
		
	}

}
