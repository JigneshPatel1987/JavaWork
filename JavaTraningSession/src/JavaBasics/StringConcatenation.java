package JavaBasics;

public class StringConcatenation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// + : Plus Sign is Conctaenation Operator
		// println : is just used to print in new line console output
		// print : is just used to print on the console
		
		int a = 100;
		int b = 200;
		
		String x = "Hello";
		String y = "World";
		
		double c = 12.33;
		double d = 10.33;
		
		System.out.println(a+b);
		
		System.out.println(x+y);

		System.out.println(a+b+x+y);
		
// Always remember that there is Left to Right Executation that is why out put is HelloWorld100200 but not HelloWorld300.
		
		System.out.println(x+y+a+b);
		
		System.out.println(x+y+(a+b));
		
		System.out.println(a+b+x+y+a+x+b+y);

		System.out.println(a+b+x+y+a+b);
		
		System.out.println(c+d);
		
		System.out.println(x+y+c+d);
	
		System.out.println("HelloWorld");
		
		System.out.println(a);
		
		System.out.println("The value of a is : " + a);
	
		System.out.println("The value of b is : " + b);
		
		System.out.println("The value of a and b is : " + a + b);

		System.out.println("The value of a and b is : " + (a + b));
		
		System.out.println("Hello Selenium");
		System.out.println("Hello Testing");
		
		// Println is for New Line and Print is with Same line like Continue in one line 
		
		System.out.print("Hello Selenium");
		System.out.println("Hello Testing");
		
		
		
		
	}

}
