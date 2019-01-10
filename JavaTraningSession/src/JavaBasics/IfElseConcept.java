package JavaBasics;

public class IfElseConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a = 30;
int b = 20;

if (b>a)
{
System.out.println("b is gretaer then a ");
}
else
{
System.out.println("a is gretaer then b");	
}
// Comparasion Operator:  < > <= >= == !=
// == : Comparasion Operator
// = : Assining Operator like if you assign c=d then whatever value of d is assigned to c
int c = 40;
int d = 50;

if (c==d)
{
System.out.println("c and d are equal");
}
else
{
	System.out.println("c and d are not equal");
	}

// Write a logic to find out highest number

// Nested if-else 
// & Operator

int a1 = 400;
int b1 = 500;
int c1 = 300;

if (a1>b1 & a1>c1) // false & false = false // true & true = ture // false & true = false
{ 
System.out.println("A1 is Gretaest");	
}
else if(b1>c1)
{
System.out.println("B1 is Gretaest");	
}
else
{	
System.out.println("C1 is Greatest");
}
	
	}

}
