//Problemm statement Java Program to swap 2 numbers without using third variable

package Basics;

public class swapTwoNos1 {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		System.out.println("First number before swap: " + a);
		System.out.println("Second number before swap: " + b);

		a = a + b; //a = a*b;
		b = a - b; //b = a / b;
		a = a - b; //a = a / b;

		System.out.println("First number after swap: " + a);
		System.out.println("Second number after swap: " + b);

	}

}
