
public class Array_2D {

	public static void main(String[] args) {
	 	 int rows=3;// there is one limitation of array is that array size need to be predefined.
	 	 int cols=3;
	 	 
	 	 int table[][]=  new int [rows][cols];
	 	 
	 	 table[0][0]=10;
	 	 table[0][1]=12;
	 	 table[0][2]=13;
	 	 
	 	 table[1][0]=20;
	 	 table[1][1]=22;
	 	 table[1][2]=23;
	 	 
	 	 
	 	 table[2][0]=30;
	 	 table[2][1]=32;
	     table[2][2]=33;

	    System.out.println(table.length);//it will print row length 
	    
	    System.out.println(table[0].length);//it will print cols length
	    
	    System.out.println(table[0][0]);//print the value of  
	    
	    //to print complete array in rectangular form
	    for(int i=0; i<rows; i++){
	    	for(int j=0; j<cols; j++){
	    		System.out.println(" "+table[i][j]);
	    	}
	    	System.out.println(" ");
	    }
	}

}
