package Encopsulation;

public class ATM {
	public static void main(String[] args) {
		Bank obj=new Bank();//Draw backs is is anybody want to know the pin he can call the pin functionality and withdraw the amount
		//he call the pin method and update the pin and can withdraw the amount.
		//thats why we need to make the access modifier as private so that no one can call 
		//the method and change pin or any credentials
		//so in Bank class we will make the pin and balcAmnt to private to maintain the security breaches
		
		//obj.Withdrawl(123456, 123, 2000);
		obj.updatePin(123456, 123, 1234);
	}
}


