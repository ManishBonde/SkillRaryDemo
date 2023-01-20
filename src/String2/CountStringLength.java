package String2;

import java.util.Arrays;
import java.util.List;

public class CountStringLength {

	public static void main(String[] args) {
		List<String> stringList =Arrays.asList("welcome", "to","cloudtech", "for", "Java", "Interview", "coding",
				"questions");
		long count=stringList.stream().filter(str ->str.length() > 5).count();
		System.out.println("String count greater than 5 characters: "+count);
	}
	
}
