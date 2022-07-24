package Array;

import java.util.Scanner;

public class CopyElements {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array: ");
		int s=sc.nextInt();
		System.out.println("Enter the elements of an array: ");
		int[] a=new int[s];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		int[] b=new int[a.length];
		for(int i=0;i<b.length;i++) {
			b[i]=a[i];
		}
		
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]+"   "+b[i]);
		}
		
	}

}
