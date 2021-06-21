 package BasiscofJava;

public class TwoDArray {

	public static void main(String[] args) {
	
		int row=3;
		int col=3;
		
		
		int table[][]= new int[row][col];
		
		table[0][0]=12;
		table[0][1]=23;
		table[0][2]=34;
		
		table[1][0]=10;
		table[1][1]=20;
		table[1][2]=30;
		
		table[2][0]=40;
		table[2][1]=50;
		table[2][2]=60;
		
		System.out.println(table.length);
		System.out.println(table[2][1]);
		
		for ( int i = 0; i<row ; i++) {
			
			for ( int j = 0; j<col; j++) {
				System.out.println(" "+table[i][j]);
			}
			
			
			
		}
	}

}
