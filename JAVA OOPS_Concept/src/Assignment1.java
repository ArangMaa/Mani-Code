
public class Assignment1 {

	//calculator
	//methods--add , sub, mul,div
	//return type shoul be int
	// parameter 2 and bbit shoulb be int
	 public int add(int a, int b){
	 
		 
		 return a+b;
	 }
	 public int sub(int a, int b){
		 
		
		 return a-b;
	 }
 public int mul(int a, int b){
		 
		 
		 return a*b;
	 }
 public int div(int a, int b){
	 

	 return a/b;
 }
 public char Find(char a){
	 
	 return 'a';
 }
	
	public static void main(String[] args) {

		Assignment1 cal =new Assignment1();
		
	System.out.println(cal.add(5, 7));
	System.out.println(cal.sub(5, 7));
	System.out.println(cal.mul(5, 7));
	System.out.println(cal.div(5, 7));
	System.out.println(cal.Find('a'));

		
	}

}
