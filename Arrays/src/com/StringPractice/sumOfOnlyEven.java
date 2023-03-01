package com.StringPractice;

import java.util.Scanner;

public class sumOfOnlyEven {
	//wap to calculate some of only even numbers

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int []a= new int [5];
		System.out.println("enter the number ");
		for (int i = 0; i<5; i++) {
			a[i]=sc.nextInt()	;
		}
		int sum=0;
		for (int i=0;i<5;i++) {
			if(a[i]%2==0) {
				sum=sum+a[i];
			}
		}
		System.out.println("the sum of only even numbers in an array is :"+sum);

	}

}
