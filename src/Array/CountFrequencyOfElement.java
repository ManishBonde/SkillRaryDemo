package Array;

import java.util.HashMap;
import java.util.Map;

public class CountFrequencyOfElement {

	public static void countFreq(int[] a) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < a.length; i++) {

			if (map.containsKey(a[i])) {
				map.put(a[i], map.get(a[i]) + 1);
			} else {
				map.put(a[i], 1);
			}
		}
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() +"- - - >> " +entry.getValue());
		}
	}

	public static void main(String[] args) {
		int[] a = { 10, 10, 20, 30, 20, 5, 5 };
		countFreq(a);
	}

}
