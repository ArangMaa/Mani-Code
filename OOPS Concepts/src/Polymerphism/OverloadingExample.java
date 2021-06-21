package Polymerphism;

public class OverloadingExample {

	public static void main(String[] args) {
		OverloadingExample obj=new OverloadingExample();
		obj.add(5);//i can call all method
		//why overloading is required
		/*
		 * suppose face book login ask for mobile number and password or user id and password 
		 * so evry time we can't change the signature of any particular method
		 * 
		 * we can overload the main method also but signature should be different
		 * Varargs-it is a methad and capable of as many as variables
		 * 
		 */
obj.Addition(10,20,30,40,50,60,70,80,90);//I can give as many as variable 
	}
	
	public void doLogin(int mobile , String password){//evry time we cant chnage the signature hence we use overloding
		
	}
public void doLogin( String password, String user ){
		
	}
public void add(){
	
}


public void Addition(int...a){
	
	int [] var=a;
	
	
}
public void add(int a, int b){
	
}

public void add(int a,int b,int c){
	
}

public void add(int a){
	
}

}
