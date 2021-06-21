import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebook {

	public static void main(String[] args) {
		
			
			try {
				System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\src\\test\\resources\\BrowserExe\\geckodriver.exe");
				WebDriver driver= new FirefoxDriver();
				driver.get("https://m.facebook.com/login/");
						
	Thread.sleep(4000);
	
	
//Enter email id
	driver.findElement(By.id("text")).sendKeys("manita.ti@gmail.com");
	
	//Enter password 
	driver.findElement(By.id("password")).sendKeys("manita.ti@gmail.com");
	
	//Click on go button
	
	driver.findElement(By.xpath("//*[@id=\'u_0_5\']")).click();
	Thread.sleep(3000);
	
	//Alert Interfaace Object to use theose methhods
	
	Alert alert=driver.switchTo().alert();
	
	//Validations  to fetch the alert text and store into vriable
	String actualAlertsText=alert.getText();
	System.out.println("Actual alert text is..."+actualAlertsText);
	String ExpectedAlertText="Testalert";
	if(actualAlertsText.equals(ExpectedAlertText))
	{
		System.out.println("Pass");
	}else
	{
		System.out.println("Fail");
	}
	Thread.sleep(3000);
	//Click on ok botton to accept alert
	alert.accept();
	
	//switch mouse to focus to default page
	
	driver.switchTo().defaultContent();
	Thread.sleep(3000);
	
	driver.quit();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	

	}


