package PracticeSession;

public class PrintNaturalNum {
	
	public static int printN(int n) {
		
		if (n==0) {
			return 0;
		}
		System.out.println(n);
		return printN(n-1);
	}
	public static void main(String[] args) {
		int n=printN(5);
		System.out.println(n);
		}

}
