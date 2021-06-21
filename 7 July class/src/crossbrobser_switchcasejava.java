import java.awt.geom.Ellipse2D;

public class crossbrobser_switchcasejava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String vBrowser="chrome";
	if (vBrowser.equalsIgnoreCase("Firefox")) 
	{
		System.out.println("Run app on firefox browser");
		
	}else if(vBrowser.equalsIgnoreCase("Chrome"))
	{
		System.out.println("Run app on chrome");
		
	}else if(vBrowser.equalsIgnoreCase("IE"))
	{ System.out.println("Run app on IE");
	
		
	} else
	{
System.out.println("Selium des not support ");
	}

}}
