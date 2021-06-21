
public class Nested_loop {

	public static void main(String[] args) {
		// WAp to print table from range 1 to 5
		for(int tcid=1; tcid<=5;tcid++)// outer for loop  range 1 to 5
		{
			System.out.println("=============");
			System.out.println("test case idis ...>"+tcid);
			
			for(int tsid=1;tsid<=10;tsid++)//inner for loop for test steps
			{
				System.err.println(tcid*tsid);
			}
			
			
		}

	}

}
