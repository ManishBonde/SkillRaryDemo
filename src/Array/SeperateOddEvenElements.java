//WAP to print the elements from a given array such that Even element print first & odd element afterwards 
//Input--->>>int[] arr1 = { 1, 2, 5, 4, 7, 8, 11, 20 };
//Output--->>>int[] arr1 = {  2, 4, 8, 20 ,1,5,7,11};
package Array;

public class SeperateOddEvenElements {
	
	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 5, 4, 7, 8, 11, 20 };
		arrayEvenandOdd(arr1);
	}
	public static void arrayEvenandOdd(int arr[]) {
		int[] a= new int[arr.length];
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]%2==0) {
				a[count]=arr[i];
				count++;
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]%2!=0) {
				a[count]=arr[i];
				count++;
		}
		
	}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+",");
		}

}
}
