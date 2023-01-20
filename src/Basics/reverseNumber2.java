package Basics;

public class reverseNumber2 {

	public static void main(String[] args) {
		int n = 1234;
		int reverse;
		StringBuilder sb = new StringBuilder(String.valueOf(n));
		reverse = Integer.valueOf(sb.reverse().toString());
		System.out.println("Reverse number is: " + reverse);
	}

}
