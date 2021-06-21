package Inheritance;// this called multilevel 

public class Bulldog extends Dog {//bulldog is near to dog class hence it will extends the property of dog class

	public static void main(String[] args) {
		
Bulldog bl= new Bulldog();

bl.sound();// i should be access the properties of Animal class because 
//any child class can access the property of parent class
	} //why multiple inheritance is not possible is java
	//because suppose one child having 2 parents and both parents have the same property
	//JVM will get confuse from which parent i need to call the inherit the property and it will give compile time error also.
//there is chance of ambiguity
}
