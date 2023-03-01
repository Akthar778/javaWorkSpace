package com.OwnAssisments;

import java.util.Scanner;

public class ArthematicOperation {

	public static void main(String[] args) {
		Scanner obj=new Scanner (System.in);
		System.out.println("enter first number");
		int a=obj.nextInt()	;
		System.out.println("enter second number");
		int b=obj.nextInt()	;
		System.out.println("enter the opeation");
		String s=obj.next();
		
		switch (s) {
		case "+":
			System.out.println(a+b);
			break;

		case "-":
			System.out.println(a-b);
			break;
		default :
			System.out.println("this is defalt");
			break;
		}

	}

}
