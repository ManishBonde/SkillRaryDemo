package PracticeSession;

public class PrintSumofNaturalNum {
	
	public static int sumofN(int a,int b,int sum) {
		if (a==b) {
			sum+=a;
			System.out.println(sum);
			return a;
		}
		sum+=a;
		return sumofN(a+1, b, sum);
	} 

	public static void main(String[] args) {
		int a= 1;
		int b=10;
		int sum=0;
		int m=sumofN(a, b, sum);
		System.out.println(m);
		

	}

}
