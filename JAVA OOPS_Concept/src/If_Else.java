
public class If_Else {

	public static void main(String[] args) {

	/*	int num = (int) (Math.random() * 10);
		System.out.println(num);

		if (num >= 10)
		{

			System.out.println(" Number is greated than 10");
		} 
		else if (num < 10 && num > 5)
		{

			System.out.println(num + " Number is beetween 5 and 10");
		} 
		else 
		{
			System.out.println("Number is less than 10");
		}*/
		//suppose I want to check odd or even number
		int num=3;
			
		if( num%2==0)
		{
		System.out.println(num   +  "Number is even");
		
		}else if(num<=5 && num<10)
		{
			System.out.println(num +"Number is beetween 10 and 5");
		}
			
		else
		{
			System.err.println(num  +  "Number is odd");
		}
	}
}
