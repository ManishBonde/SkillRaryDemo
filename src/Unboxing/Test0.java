package Unboxing;

public class Test0 {

	public static void main(String[] args) {
		Integer obj=100;
		int n= obj.intValue();
		System.out.println(obj);//NPDT "String"
		System.out.println(n);//PDT "integer"
		}

}
