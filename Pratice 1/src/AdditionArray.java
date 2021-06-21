
public class AdditionArray {

	public static void main(String[] args) {

		
		int [] a=new int [5];
		{
			for(int i=0; i<a.length;i++){// 1st approach to print all the values
				System.out.println(i);
			}
		}
	boolean []b= new boolean [3];
	{
		for(boolean bb:b){// second approach to print all the values
			System.out.println(bb);
		}
	}
	
	//user define data type
	AdditionArray[] x= new  AdditionArray[5];//AdditionArray is name of class
	
	{
		
		for(AdditionArray yy:x){
			System.out.println(yy);
		}
	}
	
	int []z= new int [3];// addition of 2 arrays 
	
	z[0]=10;
	z[1]=20;
	
	z[2]=z[0]+z[1];
	{
		System.out.println(z[2]);
	}
	}
	
}
