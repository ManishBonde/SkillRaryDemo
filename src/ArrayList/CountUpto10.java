package ArrayList;

import java.util.ArrayList;

public class CountUpto10 {
	/**
	 * WAP TO PRINT 1 TO 10 NOS USING ARRAYLIST IN JAVA*
	 * @param args
	 */
	
	public static void main(String[] args) {
		int min = 1;
		int max = 10;
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = min; i <= max; i++) {
		    list.add(i);   
		}
		System.out.println(list);
	}

}
