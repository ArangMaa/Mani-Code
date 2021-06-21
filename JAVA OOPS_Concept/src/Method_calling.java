
public class Method_calling {
//static component can not call non static method directly because it will throw error to creat the object 
	public static void main(String[] args) {
	// Static can call  directly static without creating the object
	// non static can call  directly non static without creating the object
	//non static can call static method directly without creating the object
		Method_calling  M=new Method_calling ();
		M.go();
		M.go1();
		//M.go2();

	}
public void go()
{
System.out.println("Inside go method");	
go1();// I can call Go1 method without creating the object og go method because both shares the same behabiour
//Because both methods are in same class and both are non static method 
//if method is static it is compulsory to creat the object of the class.

}
public void go1()
{
System.out.println("Inside go1 method");	

go2();//go2 is static method and go1 is non static hence non static can call static directly 
}
public static void go2()
{
System.out.println("Inside go2 method");	
}
}
