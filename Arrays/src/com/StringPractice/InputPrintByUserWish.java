package com.StringPractice;

import java.util.Scanner;

public class InputPrintByUserWish {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("enter size of array");
		int sizeOfArray=sc.nextInt()	;
		int array []=new int[sizeOfArray];
		for (int i = 0; i < array.length; i++) {
			System.out.println("enter the value");
			array[i]=sc.nextInt();
			
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
		}
		
		
		
		
		

	}

}
