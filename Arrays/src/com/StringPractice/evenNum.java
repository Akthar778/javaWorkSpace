package com.StringPractice;

import java.util.Scanner;

public class evenNum {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the arraysize");
		int sizeOfArray= sc.nextInt();
		int array[]= new int[sizeOfArray];
		for (int i = 0; i < array.length; i++) {
			System.out.println("enter the array value");
			array[i]=sc.nextInt();
			if(array[i]%2==0) {
				System.out.println("even array values are"+array[i]);
			}
		}
		for (int i = 0; i < array.length; i++) {
			
		}

	}

}
class evennub2{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("array size");
		int arraystored=sc.nextInt();
		int arrays[]=new int [arraystored];
		for (int i = 0; i < arrays.length; i++) {
			if (arrays[i]%2==0) {
				System.out.println("this is the even number "+arrays[i]);
				
			}else {
				System.out.println("this is odd number "+arrays[i]);
			}
		}
		for(int i=0;i<arrays.length;i++) {
			int arrayOutPut=arrays[i];
			System.out.println(arrayOutPut);
		}
	}
}
