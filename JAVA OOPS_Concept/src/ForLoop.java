
public class ForLoop {

	public static void main(String[] args) {
		
//	for(int i=1; i<=10; i++)// if I remove i++ compiler will print 1 for infinite times
			// if I remove i<=10 than also it will print 1 for infinite times.
		{
		//	System.out.println(i);
	/*
	 * difference between while looo and for loop
	 * in while loop we generally dont know 
upto where we need to go t0 run the loop 
	 * while loop- no. if iteration in not known
	 * for loop- from where o strat and till where need to run
	 * 		in for loop no. og iterations are know
	 * do while will at least run for 1 time
	 */

/*int num=10;//for loop to print even and odd numbers
for(int i=1;i<=num;i++)
{
	if(i%2!=0)
	System.out.println(i);
	
}*/
			
			//how to print primadi *
		int j;	; 
			for(int i=1; i<=10; i+=2)
			{	
				for (j=0;j<i;j++){
					System.out.println("*");
			}
			
		
		System.out.println("");
		
			}
	}

	}}
