package PracticeSession;

public class FibonacciSeries {
	public static int fib(int a,int b,int n) {
		if (n==0) {
			return 0;
		}
		int c= a+b;
		System.out.println(c);
		return fib(b,c,n-1);
		}
	
public static void main(String[] args) {
	int a=0;
	int b=1;
	int n=7;
	System.out.println(a);
	System.out.println(b);
	int m=fib(a, b, n);
	System.out.println(m);
}
}
