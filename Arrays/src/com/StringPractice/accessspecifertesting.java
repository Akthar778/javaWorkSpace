package com.StringPractice;

public class accessspecifertesting {
	public int a =19;
	public int b=88;
	public accessspecifertesting() {
		a=88;
	}
	public void method() {
		System.out.println("this is method");
	}
	public static void main(String[] args) {
		accessspecifertesting obj = new accessspecifertesting()	;
		System.out.println(obj.a);
		

	}

}
