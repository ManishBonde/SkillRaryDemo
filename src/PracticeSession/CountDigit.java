package PracticeSession;

public class CountDigit {

	public static void main(String[] args) {
		int num=7777777;
		int count=0;
		while (num>0) {
			num=num/10;
			count++;
		}
		System.out.println("Number of digits in given num is : "+count);

	}

}
