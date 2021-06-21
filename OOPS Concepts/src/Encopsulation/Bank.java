package Encopsulation;

public class Bank {
	public int AccntNo=123456;
	public int PinNo=123;
	public double BalcAmt=100000000;
	

	public void Withdrawl(int accno, int pin, int amount) {
		
		if (accno==AccntNo  && pin==PinNo) {
			if (amount<=BalcAmt) {
				BalcAmt=BalcAmt-amount;
				System.out.println("Withdrawal Amount is  :"+amount);
			} else {
				System.out.println("Insufficient Balance");
			}
		} else {
			System.out.println("Invalid credentials!!!");

		}
		
	}


	public void updatePin(int accno, int pin, int npin) {
		
		
		if(accno==AccntNo  && pin==PinNo){
			if(pin==npin){
				
				System.out.println("Pin change sussessfully");
				
				
			}else{
				System.out.println("Invalid crenditials");
			}
		}
		
		
	}

}
