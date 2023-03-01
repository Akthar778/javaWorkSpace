package simpleAbstractClass;

import java.util.ArrayList;

public class arrayListp2 {
	public static void main(String[] args) {
		ArrayList a1 = new ArrayList();
		a1.add("this is string");
		a1.add(88);
		a1.add(true);
		a1.add(false);
		a1.add('c');
		a1.add(8.3322);
		System.out.println(a1);
		a1.remove(true);
		System.out.println(a1);
		a1.contains('c');
		System.out.println(a1.size());
		ArrayList a2 = new ArrayList();
		a2.add(true);
		System.out.println(a2);
		//add a1 to a2 addAll method
		a2.add("this is a2 method");
		a1.addAll(a2);
		System.out.println(a1);
		
		a1.remove(a2);
		System.out.println();
		a1.removeAll(a2);
		System.out.println(a1);
		
		System.out.println(a1.isEmpty());
		
		System.out.println(a1.get(3));
		
		a1.add(a2);
		System.out.println(a1);
		
		a1.addAll(0,a2);
		System.out.println(a1);
		
		System.out.println(a1 instanceof ArrayList); // to check the instance of array 
		
		//extracting objects using for loop
		for (int i = 0; i < a1.size(); i++) {
			System.out.println(a1.get(i));
			//obj.get(i)//
			
		}
		//for each loop collection alo we can use arry also we can use 
		for (Object referenc_variable : a2) {
			System.out.println(referenc_variable);
		}
		int a[]= {1,2,3};
		for (int i : a) {
			System.out.println(i);
		}
		
	}

}
