package List_Interface;

import java.util.Arrays;
import java.util.List;

public class SquareOfNums {

	public static void main(String[] args) {
		List<Integer> integers = Arrays.asList(4, 5, 20, 7, 10, 9);
		integers.stream().mapToInt(n -> n * n).forEach(System.out::println);
		integers.stream().mapToInt(n ->n*n).filter(n -> n >=100).forEach(System.out::println);

	}

}
