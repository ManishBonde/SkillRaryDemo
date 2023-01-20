package Collections;

import java.util.ArrayList;

public class ArrayList_isEmpty {
	
	public static void main(String[] args) {
		ArrayList<Object> obj=new ArrayList<Object>();
		System.out.println("Elements are not available: "+obj.isEmpty());
	    obj.add(true);
	    System.out.println(obj);
	    System.out.println("Elements are  available: "+obj.isEmpty());
	    
	}

}
