//WAP TO FIND MISSING NUMBER FROM AN ARRAY . . . INPUT-->>[1,2,3,4,6,7,8,9,10] & OUTPUT-->>5
package Array2;

public class FindMissingNum {
	public static void main(String[] args) {
		int[] a = new int[] { 1, 2, 3, 5, 6, 7, 8, 9, 10 };
		int sum = (10* 11) / 2;
		int actSum = 0;
		for (int i = 0; i < a.length; i++) {
			actSum = actSum + a[i];
		}
		System.out.println("Missing number is :" +( sum-actSum));

	}

}
