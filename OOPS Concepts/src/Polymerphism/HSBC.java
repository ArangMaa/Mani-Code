package Polymerphism;

public class HSBC extends RBI{
	
	public HSBC getReturn(){//we have a method with same signature but different retuen type
		HSBC obj= new HSBC();
		return obj;
	}

	public static void main(String[] args) {
		HSBC obj1=new HSBC();
		
		System.out.println(obj1.getCarLoan());
		

	}
// I can change the return type in case if my return type is class name 
}
