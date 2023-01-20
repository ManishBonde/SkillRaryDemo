package Important;

public class FibonacciSeries {

	public static void main(String[] args) {
		int n1 = 0;
		int n2 = 1;
		int count = 10;
		int i = 1;
		int n3;
		while (i <= count) {
			System.out.print(n1 + " ");
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			i++;
		}

	}
}
