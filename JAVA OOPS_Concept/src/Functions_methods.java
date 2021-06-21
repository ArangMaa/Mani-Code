
public class Functions_methods {

	public static int  a=30;
	public static int b=30;
	
	
	
	public static void print(){
		System.out.println("Learning methos and functions");
	}
	
	public static void add(){
		
		int c=a+b;
		System.out.println("Additions of two numvers is : " +c);
	}
	public static void add(int r, int s){// this is known as function overloading or method overloading
		//because we have same function name but different parameters
		int add=r+s;
		System.out.println("Adding number is:"+add);
	}
	
	public static void main(String[] args) {
		print();
		add();
		add(30, 70);

	}

}
