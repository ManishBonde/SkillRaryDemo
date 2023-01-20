package Important;

public class StrongNum {

	public static void main(String[] args) {
		int n=145;
		int sum=0;
		int fact=1;
		int m=n;
		while(n>0) {
			int a=n%10;
			sum = sum+fact(a);
			n=n/10;
		}
		if(sum==m) {
			System.out.println("Strong NUM");
		}
		else {
			System.out.println("NOT Strong NUM");
		}
	}
	public static int fact(int n) {
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		return fact;
	}

}
