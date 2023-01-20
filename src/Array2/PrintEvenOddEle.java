//WAP TO PRINT EVEN & ODD ELEMENTS FROM GIVEN ARRAY SUCH THAT EVEN ELEMENT PRINT FIRST & THEN ODD ELEMENT WILL PRINT.
package Array2;

public class PrintEvenOddEle {
	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 5, 4, 7, 8, 11, 20 };
		printEvenOdd(arr1);
	}

	public static void printEvenOdd(int[] arr) {
		int[] a = new int[arr.length];
		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				a[index] = arr[i];
				index++;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0) {
				a[index] = arr[i];
				index++;
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+",");
			
		}

	}

}