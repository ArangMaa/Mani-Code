
public class Array {

	public static void main(String[] args) {
		//Array are just another way of storing data
		//they are the set of same data type and same name but different memory location
		//first element store at oth index
		//supoose we have to store the value of 10 employees
		
		/*int [] salary;
		
		salary= new int[10];
		
		String month[] =  {"Jan", "Feb", "March"};
		System.out.println(month[1]);// it will print the value stored at 1 position
		System.out.println(month.length);// it will print the length of the array
		
		for(int i=0; i<=month.length; i++){
			System.out.println(month[i]);//it will print all the elements stored in the array
		}*/
		
		//supose I have to print the student age and class
		 int [] age;
		 age= new int[10];
		 String Std []= {"class1","class2","class3","class4" };
		 System.out.println(Std[2]);
		 System.out.println(Std.length);
		 
		 for(int i=0;i<=Std.length; i++)
		 {
			 System.out.println(Std[i]);
		 }

		 

	}

}
