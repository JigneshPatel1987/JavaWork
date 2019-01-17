package JavaBasics;

public class TwoDimArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// you can write like x[][] or [][]x
		
		String x[][] = new String [3][5];
		
		System.out.println(x.length); // 3 --> Total Numebr of Row
		System.out.println(x[0].length); // 5 --> Total Number of Colm
		
		
		// 1st Row
		x[0][0] = "A";
		x[0][1] = "B";
		x[0][2] = "C";
		x[0][3] = "D";
		x[0][4] = "E";
		
		// 2nd Row
		x[1][0] = "A1";
		x[1][1] = "B1";
		x[1][2] = "C1";
		x[1][3] = "D1";
		x[1][4] = "E1";

		//3rd Row
		x[2][0] = "A2";
		x[2][1] = "B2";
		x[2][2] = "C2";
		x[2][3] = "D2";
		x[2][4] = "E2";
		
		System.out.println(x[1][2]);
		System.out.println(x[2][2]);
		
		System.out.println(x[0][4]);
		
		// Print all the values of 2 Dim Array : Using Loops
		// row =0; col 0 to 4;
		// row =1; col 0 to 4;
		// row =2; col o to 4;

		for(int row=0; row<x.length; row++)
		{
			for(int col=0; col<x[0].length; col++)
			{
				System.out.println(x[row][col]);
			}
		}
	}

}
