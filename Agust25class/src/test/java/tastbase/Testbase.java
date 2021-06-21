package tastbase;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

public class Testbase {
public static String vURL, vFirstName, vLastName,VExcptedSearchtext;
public static WebDriver driver;

@Before

public void initialization()

{
	vURL="http://www.linkedin.com";
	
	 vFirstName = "Bill";
	vLastName="Gates";
	VExcptedSearchtext="Bill gates profile";
	
}	
@After
public void quit()

{
	System.out.println("Browser is closed...@AfterTest");
}
}
