
public class RandomNumbers {

	public static void main(String[] args) {
	 
		int num= (int) (Math.random()*5);
		System.out.println(num);//it will always provide double value becaus random is pre defind method in java in math class
		// if you want integer value than you need to type cast or conversion to add (int) math.random() 
		//than if we want to type random number beetween 5 than multiply with 5

	}

}
