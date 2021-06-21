
public class Break_statement {

	public void go(){
		
		System.out.println("First");
		
		//break;(break works with  the loop)
		//continue;(it  works inside the loop)
		System.out.println("Second");
	}
	
	
	public static void main(String[] args) {
		/*Break_statement b=new Break_statement();
		b.go();*/

		/*for(int i=0; i<=10; i++){
			if(i==5)
				break;
			System.out.println(i);
			
		}*/  //lets check for continue 
		for(int i=0; i<=10; i++){
			if(i>=0)
				continue;//it continue to the next i++ execution mostly continue is used to skip the iteration
			System.out.println(i);
			
		}
	}

}
