package PracticeSession;

import java.util.Scanner;

public class PrimeNum {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the num that ypu want to check: ");
	    int n= sc.nextInt();
	    int c=0;
	    for (int i=1;i<=n;i++) {
			if (n%i==0) {
				c++;
			}
			
	    }
	    if (c==2) {
			System.out.println(n+": Entered num is PRIME");
		}
	    else {
	    	System.out.println(n+": Entered num is NOT PRIME");
	    }
	    

	}

}
