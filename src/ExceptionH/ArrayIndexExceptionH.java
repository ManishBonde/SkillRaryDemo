package ExceptionH;

public class ArrayIndexExceptionH {
	
	public static void main(String[] args) {
		System.out.println("Program Begins...");
		try {
			int[] a= {1,2,3,4};
			System.out.println(a[4]);
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("Program Ends...");
	}

}
