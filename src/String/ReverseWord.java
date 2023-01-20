package String;

public class ReverseWord {

	public static void main(String[] args) {
		String s1="java selenium Hellow";
		String[] a=s1.split(" ");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]+" ");
		}
		System.out.println(" ");
		for (int i = a.length-1; i >=0; i--) {
			System.out.println(a[i]+" ");
		}
	}
}
