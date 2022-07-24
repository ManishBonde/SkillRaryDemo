package Array;

import java.util.Arrays;
import java.util.Scanner;

public class SortingArray {
	static int i;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array: ");
		int s= sc.nextInt();
		System.out.println("Enter the elements of an array: ");
		int[]a=new int[s];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++) {
			System.out.println("Elements before sorted: "+a[i]);
			Arrays.sort(a);
			System.out.println("Elements after sorted: "+a[i]);
		}
	}

}
