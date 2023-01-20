package String;

public class CountCharRepeated {

	public static void main(String[] args) {
		
		String s1="madam";
		char ch='m';
		int count =0;
		for(int i=0;i<s1.length();i++) {
			if(s1.charAt(i)==ch) {
				count++;
			}
		}
		System.out.println("Repeated char count is: "+count);

	}

}
