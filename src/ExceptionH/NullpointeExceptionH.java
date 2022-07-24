package ExceptionH;

public class NullpointeExceptionH {
	
	public static void main(String[] args) {
		System.out.println("Program Begins...");
		try {
			int[]a=null;
			System.out.println(a.length);
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("Program Ends...");
	}

}
 