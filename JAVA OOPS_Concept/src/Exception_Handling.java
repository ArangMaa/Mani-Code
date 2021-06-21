
public class Exception_Handling {

	public static void main(String[] args) {
		
		System.out.println("Before try block");
		try {
			System.out.println("Beginging");
			
			int divide=10/0;//suppose i write 10/0 it will give me arithmatic expression error to handle this error 
			//will keep the whole code under try catch block means 
			//if error is their it will show but program will not terminate and it will move to next statement 
			//to execute the code
			System.out.println(divide);
		} catch (Exception e) {
			System.out.println("Error Found");
			System.out.println(e.getMessage());//print the error message
			e.printStackTrace();//this described what is the error
			System.out.println("End");
		}
		
		System.out.println("After try catch block");

	}

}
