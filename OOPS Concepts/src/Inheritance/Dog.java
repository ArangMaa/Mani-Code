package Inheritance;//single level inheritance where one single child inherit the propeties of one ingle paranet

public class Dog  extends Animal{

	
	public static void main(String[] args) {
		Dog obj=new Dog();// we have created the object of dog because dog wants to 
		//create sound Animal does not want to create sound
		obj.sound();
	}
}
