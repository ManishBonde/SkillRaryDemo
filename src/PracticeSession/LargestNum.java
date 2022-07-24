package PracticeSession;

import java.util.Scanner;

public class LargestNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers: ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c= sc.nextInt();
		
		int largest1=a>b?a:b;
		int largest2=c>largest1?c:largest1;
		
		System.out.println("Largest number is: "+largest2);

	}

}
