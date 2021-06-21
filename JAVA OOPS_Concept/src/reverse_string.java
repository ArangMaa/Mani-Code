
public class reverse_string {

	public static void main(String[] args) {
		String name="Ankit";
		
		int len=name.length();//first we will find the length of the string
		 String  rev= " ";
		
		for(int i=len-1;i>=0; i--) {// string index value start from o, len-1,
			
			rev=rev +name.charAt(i);
			System.out.println(rev);
			
			
		}

	}

}
