package Testcase;
import tastbase.Testbase;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstTestcase {
@Test
	public void Logintest()
	{
	try {
		System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\src\\test\\resources\\BrowserExe\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("http://www.Linkdin.com");
				
Thread.sleep(4000);

driver.quit();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
		
	}
	
	

