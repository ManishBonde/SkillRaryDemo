package Array;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElements2 {

	public static void main(String[] args) {
		
		int[] a = { 1, 2, 5, 5, 6, 6, 7, 2 };
		
		Set<Integer> dupEle = new HashSet<>();
		
		for (Integer num : a) {
			
			if (!dupEle.add(num)) {
				
				System.out.println("Duplicate Element found: "+num);
				
			}
			
		}

	}

}
