package JavaBasics;

public class ArrayConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// array : to store similar data type values in a array variable
		
		// One-Dim Array
		
		// 1. int array:
		// lowest bound/index = 0
		// upper bound/index = n-1 (n is size of array)
		
		
		//Adv : I can strore multiple value in single datatype
		//DisAdv : 1. Size is fixed -- static array - hotel name example --> to overcome thsi problem we used collections -- Arraylist, Hashtable -- Dynamic Array
		        // 2. store only similar datatype values only --> to overcome this problem we need to used Object array 
		int i[] = new int[4];
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;
		
		System.out.println(i[2]);
		System.out.println(i[3]);
		
		// 		System.out.println(i[4]); // ArrayIndexOutOfBoundsException
		
		System.out.println(i.length); // size // length of the array
		
		// print all the values of the array : using for loop
		
		for (int j=0; j<i.length; j++)
		{
			System.out.println(i[j]);
		}
		
		// 2. Double Array
		
		double d[] = new double [3];
		
		d[0] = 12.33;
		d[1] = 13.44;
		d[2] = 14.67;
		
		System.out.println(d[2]);
		System.out.println(d.length);
		
		// 3. char array 
		
		char c[] = new char[3];
		c[0] = 'a';
		c[1] = 2;
		c[2] = '$';
		
		System.out.println(c[2]);
		System.out.println(c.length);
		
		// 4. boolean array
		
		boolean b[] = new boolean [2];
		b[0] = true;
		b[1] = false;
		
		System.out.println(b[0]);
		System.out.println(b.length);
		
		// 5. string array
		
		String s[] = new String [3];
		s[0] = "Test";
		s[1] = "Hello";
		s[2] = "World";
				
		System.out.println(s.length);
		System.out.println(s[1]);
		System.out.println(s[1] + s[2]);
		
		// 6. Object array: (Object is a class ) --- is used to store different data types value
		
		Object ob[] = new Object [6];
		
		ob[0] = "Tom";
		ob[1] = 25;
		ob[2] = 12.33;
		ob[3] = "M";
		ob[4] = "1/1/1990";
		ob[5] = "London";
				
		System.out.println(ob[5]);
				System.out.println(ob.length);
				
		
				
				

	}

}
