package com.StringPractice;
import java.util.Scanner;

public class sumofarray {

	public static void main(String[] args) {
		int sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of the array");
		int size = sc.nextInt();
		
		
		//array creation
		
		int a []=new int [size];
		for (int i = 0; i < a.length; i++) {
			System.out.println("enter the array values");
			a[i]=sc.nextInt()	;
			 sum = sum+ a [i];
			
		}
		System.out.println("this is sum of array values  "+sum);
		for (int i = 0; i < a.length; i++) {
			//System.out.print(a[i]+"\n");
//			System.out.println("The sum of array is "+sum);
//			break;
		}
		
		

	}

}
