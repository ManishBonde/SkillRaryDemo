package String;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter the string: ");
	 
	 String str1=sc.next();
	 String org_str1=str1;
	 String rev=" ";
     int len=str1.length();
     for(int i=len-1;i>=0;i--) {
    	 rev= rev+str1.charAt(i);
     }
     if (org_str1.equals(rev)) {
		System.out.println(org_str1+" : is palindrome string");
	} else {
		System.out.println(org_str1+" : is not palindrome string");
	}
	}

}
