import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Wikipedia_Dropdown {

	public static void main(String[] args) {
		
		try {
			System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\src\\test\\resources\\BrowserExe\\geckodriver.exe");
			WebDriver driver= new FirefoxDriver();
			driver.get("https://www.wikipedia.org/");
					
Thread.sleep(4000);

WebElement listbox=driver.findElement(By.xpath("//*[@id='searchLanguage']"));

Select se=new Select(listbox);
se.selectByValue("hi");


driver.quit();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	}


