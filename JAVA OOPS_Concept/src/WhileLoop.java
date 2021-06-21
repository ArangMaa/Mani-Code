
public class WhileLoop {

	/*
	 *  Any loop work on some criteria
	 *  entry criteria----loop conditions must be true
	 *  exit--criteria
	 * loop are not statements it does not terminate it just exit the loop
	 */
		
	public static void main(String[] args) {
		int i=1;
		while (i<=10) {//As soon as I remove the {} bracket from the body and 
			//run it will print only 1 because after System.out.println(i); semicolon is 
			//there so loop will terminate every time there and continually it will type 1.
			System.out.println(i);
			i++;
		}

	}

}
