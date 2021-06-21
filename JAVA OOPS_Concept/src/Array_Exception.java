
public class Array_Exception {

	public static void main(String[] args) {
		
		System.out.println("Beging");
		
		try {
			int i[]= new int[5];
			
			i[6]=100;
		} catch (Exception e) {
		System.out.println("Error occured");
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		System.out.println("End");

	}

}
