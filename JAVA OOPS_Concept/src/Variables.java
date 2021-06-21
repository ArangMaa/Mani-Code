
public class Variables {
int i=10;// these variables belongs to the instance of the class 
	public static void main(String[] args) {
		//instance /Local/Class variables
		
		/* instance ------declared in class body
		 * variavlr declaired in method are local variables
		 */
	//int i=123;// instance variables --Global variable
		
		
		Variables V=new Variables();// v-- object and i=10
		V.i++;//when i is called i value increase and becomes 11
		
		Variables V1=new Variables();// same as above
		V1.i++;
		
		
		Variables V2=new Variables();// v2---object and i=10 hence it prints the valus of i=10
		System.out.println(V2.i );
	}

}
