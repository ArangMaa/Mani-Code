import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Rediff_Sceenshot {

	public static void main(String[] args) {
		
		
		try {
			System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\src\\test\\resources\\BrowserExe\\geckodriver.exe");
			WebDriver driver= new FirefoxDriver();
			driver.get("http://www.rediff.com");
					
Thread.sleep(4000);
Rediff_Sceenshot.getSceenshot("C:\\Users\\arpit_siku\\eclipse-workspace\\Agust25class\\src\\test\\resources\\Screenshot\\rediff.jpg");

driver.quit();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Rediff_Sceenshot.getSceenshot("C:\\Users\\arpit_siku\\eclipse-workspace\\Agust25class\\src\\test\\resources\\Screenshot\\rediff.jpg");
		}
	}

	private static void getSceenshot(String string) {
		// TODO Auto-generated method stub
		
	}

}
