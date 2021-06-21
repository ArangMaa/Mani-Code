package Polymerphism;

public class CITI extends RBI {

	public static void main(String[] args) {
CITI obj=new CITI();

System.out.println(obj.getHomeLoan());//why we do override 
//we do overriding because we have the clear requirememt but parant of the child class is not able 
//to fullfill the requirement
//in RBI class car loan was9.5, but CITI bank want its own reqirement that it shpuld be 10.5 hence with 
//the same method name we have created the method  with same name and signature only vale is different as per requirement
System.out.println(obj.getCarLoan());
//we get questin that can we change the return type of the method while performing overriding-no in place of double we cant write int
	}
public double getCarLoan(){
		
		return 10.5; 
	}
}
