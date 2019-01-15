package JavaBasics;

public class LoopsConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//System.out.println(1);
//System.out.println(2);
//System.out.println(3);
//System.out.println(4);
		
		// 1. While Loop: 
		// dis-advantage of while loop : it will generate infinite loop if you dont give incremnt or decremnt part.
		// Print 1 to 10
		int i =1; // initialization 
		while(i<=10) // conditional 
		{
			System.out.println(i);
			i=i+1; // incremental / decremental 
		}
		
		
		System.out.println("***********************************");
		
		
		// 2. For Loop:
		// j++ means j = j +1;
		// Print 1 to 10
		for(int j =1; j<=10; j++) // Initialization , condotional . Incremental
		{
			System.out.println(j);
		}
		
		System.out.println("***********************************");
		
		// k-- means  k = k-1;
		// 10 9 8 7 6 5 4 3 2 1
		//print 10 to 1
		
		// -1>-10 true
		// 1>10 false
		
		for(int k =10; k>=-10; k--) // Initialization , condotional , Decremental
		{
			System.out.println(k);
		}
	}

}
