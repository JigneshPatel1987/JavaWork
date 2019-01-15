package JavaBasics;

public class IncrementAndDecremntOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//++
		//--
		
		int i = 1;
		int j= i++; // Post Increment
		
		System.out.println(i);
		System.out.println(j);

		System.out.println("*********************");
		
		int a = 1;
		int b = ++a; // Pre Increment
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("*********************");
		
		int m =2;
		int n = m--;  // Post Decrement
		
		System.out.println(m);
		System.out.println(n);
		
		System.out.println("*********************");
		
		int p = 2;
		int q = --p;  // Pre Decrement
		
		System.out.println(p);
		System.out.println(q);
	}

}
