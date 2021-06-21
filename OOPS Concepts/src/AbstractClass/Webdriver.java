package AbstractClass;

public abstract class Webdriver {
	//suppose concrete or child class forget to overrride the properties of parant class than by default
	//parent class will be called, to overcome this issue we used abstract methodd
	//if any method is declared as abstract method than forcefully we have to declare that class as abstract class
	////suppose I add  abstract word here i will get error that abstract method don have method body
	//Abstract  methos may have some concrete methods or some have abstract methods or all methods as concrete
	//In interface all the methods are bydefault abstract in nature

	
	public abstract void Click();
	
		
	
public abstract void SendKeys();

public abstract void GetTittle();

public void Screenshot(){}
}
