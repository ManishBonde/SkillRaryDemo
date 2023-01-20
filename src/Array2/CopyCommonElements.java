package Array2;

import java.util.HashSet;
import java.util.Set;

public class CopyCommonElements {

	public static void main(String[] args) {
		int[] a = { 80, 10, 15, 2, 35, 60 };
		int[] b = { 35, 80, 60, 20, 75 };
		printIntersection(a, b);

	}

	public static void printIntersection(int[] a, int[] b) {
		Set<Integer> s = new HashSet<>();
		{
			for (int i = 0; i < a.length; i++) {
				s.add(a[i]);
			}
		}

		for (int i = 0; i < b.length; i++) {
			if (s.contains(b[i])) {
				System.out.println(b[i] + " ");
			}

		}

	}
}
