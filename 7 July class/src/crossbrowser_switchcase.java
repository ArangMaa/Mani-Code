import java.lang.invoke.SwitchPoint;

public class crossbrowser_switchcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String vBroswer="Chrome";
 switch (vBroswer) {
case "Chrome":
	System.out.println("Run app on chrome");
	break;
case "firefox":
	System.out.println("Run app on firefox");
	break;
case "IE":
	System.out.println("Run app on IE");
	break;
case "Safari":
	System.out.println("Run app on Safari");
	break;
default:
	System.out.println("Selelium wont support this browser and browser name is ...>"+vBroswer);
	break;
}
	}
	
}

