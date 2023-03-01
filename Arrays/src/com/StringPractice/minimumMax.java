package com.StringPractice;

public class minimumMax {

	public static void main(String[] args) {
		int array[] = {10,20,10,40};
		int minimum = array[0];
		int max= array[0];
		
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] < 0) {
				minimum=array[i];
			}
			if(array[i] > 0) {
				max=array[i];
			}
			
		}
		System.out.println("minimun "+minimum);
		System.out.println("maximum"+max);
		

}
}