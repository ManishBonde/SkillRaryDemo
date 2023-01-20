package String;

public class duplicateCharacters {
	
	public static void main(String args[]) {
		String s1="beautiful beach";
		char[] a=s1.toCharArray();
		for (int i = 0; i < s1.length(); i++) {
			for(int j=i+1;j<s1.length();j++) {
				if (a[i]==a[j]) {
					System.out.println(a[j]+" ");
					break;
				}
			}
		}
	}
}
