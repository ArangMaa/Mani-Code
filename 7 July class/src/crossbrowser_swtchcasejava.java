
public class crossbrowser_swtchcasejava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String vTable="IF";
switch (vTable) {
case "Chrome":
	System.out.println("Run the app chrome");
	
	break;

case "firefox":
	System.out.println("Run the app on firefox");
	
	break;
case "safari":
	System.out.println("Run the app on safari");
	
	break;
case "IF":
	System.out.println("Run the app on IE");
	
	break;
default:
	System.out.println("Selineum does not support this browser nad thgis brpwser is..."+vTable);
	break;
}
	}

}
