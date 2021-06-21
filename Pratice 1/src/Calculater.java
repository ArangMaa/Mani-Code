
public class Calculater {

	
	private String sum;

	public   Calculater (){
		System.out.println("Constroter called");
	}// Constructor which will be called by default. 
	
	public void add() {
		int num1=5,num2=3,sum;

		sum=num1+num2;
			
			System.out.println("Adding two numbers"         +        sum);
	
		
	}

	public void Sub() {
		int num1=5,num2=3,sub1;

		sub1=num1-num2;
			
			System.out.println("Adding two numbers"  +   sub1);
	
	}

	public void div() {
System.out.println("Divison of numbers");
	}

	public void mul() {
		int a=2;int b=3;
		int c=a*b;
System.out.println("multiplication of numbers"+ c);
	}

	public static void main(String[] args) {
		Calculater calc= new Calculater();
		calc.mul();
		
				

	}
}