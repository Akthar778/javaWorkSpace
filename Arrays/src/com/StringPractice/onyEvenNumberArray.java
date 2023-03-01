package com.StringPractice;

import java.util.Iterator;
import java.util.Scanner;

public class onyEvenNumberArray {
	// wap to print only even numbers from an array

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int a[]=new int [5];
		for (int i=0;i<5;i++) {
			a[i]=sc.nextInt()	;
		}
		System.out.println(" the even number in an array");
		for (int i=0;i<5;i++) {
			if(a[i]%2==0) {
				System.out.println(a[i]);
			}
		}

	}
	
	

}


/**
 * InneronyEvenNumberArray
 */
public class onlyEven {

	
}

