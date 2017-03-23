//Write a program that swaps the values of two variables without using third variable.
package java_assignment_03;

public class SwappingIntegersValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10,b=20;
		
		// values of a and b variables before swapping.
		
		System.out.println("value of a is before swapping "+a);
		System.out.println("value of b is before swapping "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		
		// values of a and b variables after swapping.
		
		System.out.println("value of a is after swapping "+a);
		System.out.println("value of a is after swapping "+b);
	}

}
