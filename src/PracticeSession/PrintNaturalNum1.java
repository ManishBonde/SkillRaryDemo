package PracticeSession;

public class PrintNaturalNum1 {
	public static int printN(int n) {
		if (n==6) {
			return 0;
		}
		System.out.println(n);
		return printN(n+1);
	}

	public static void main(String[] args) {
		int m=printN(1);
		System.out.println(m);
	}

}
