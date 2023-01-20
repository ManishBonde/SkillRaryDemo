package Basics;

public class reverseNumber1 {

	public static void main(String[] args) {
		int n = 1234;
		int m = n;
		int b = 0;
		while (n > 0) {
			int a = n % 10;
			b = b * 10 + a;
			n = n / 10;
		}
		System.out.println(b);
	}

}
