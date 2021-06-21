
public class Nested_Loop {

	public static void main(String[] args) {

		/*
		 * WRIT A PROGRAM TO RUN THE Below loops no of times 
		 * while loop-3
		 *  for loop-4 
		 *  do while loop-5 (in nested loop program will run the loop=3*4=12*5=60)
		 *  in below program first i will execute for
		 * onece and cursor will move to for loop and for loop will also execute
		 * once after that do while will execute complete till 4th time after
		 * that it will move to for loop again for loop will execute 2 time and
		 * again after execution forloop do while loop will execute for 4 times
		 * and so on after tge 3rd for loop execution is done it will move to
		 * while loop and same iteration will process
		 * 
		 */

		int i = 0;
		int count=0;// it will show the number of times loop are executed
		while (i < 3) {

			for (int j = 0; j < 4; j++) {
				int k = 0;
				do {
					System.out.println("i----" + i + "j----" + j + "k----" + k);
					k++;
					count++;
				} while (k < 5);
			}
			i++;
		}
System.out.println("total number of count" +count);
	}

}

/*
 * i j k 0 0 0 0 0 1 0 0 2 0 0 3 0 0 4 0 1 0 0 1 1 0 1 2 0 1 3 0 1 4 0 2 0 0 2 1
 * 
 * 
 * 
 * 
 * 
 * 
 */
