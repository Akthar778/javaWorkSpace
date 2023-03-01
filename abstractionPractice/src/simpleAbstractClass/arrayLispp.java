package simpleAbstractClass;

import java.util.ArrayList;

public class arrayLispp {
	public static void main(String[] args) {
		ArrayList a1= new ArrayList();
		ArrayList a2= new ArrayList<>();
		System.out.println(a1);
		a1.add(10);
		a1.add('a');
		a1.add(true);
		a1.add(123.12);
		a1.add(10);
		a1.add(null);
		a1.add("this is string");
		System.out.println(a1);
		a2.add(88);
		System.out.println(a2);
		a2.add(false);
		System.out.println(a2);
	}

}
