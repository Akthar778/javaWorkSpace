package com.OwnAssisments;

import java.lang.reflect.Method;

public class Method1 {
	static int i=9;
	int po=103;
	void m1() {
		System.out.println("this is m1 only void");
	}
	static void m2() {
		System.out.println("this is m2 with static");
		int po=10;
	}
	static void adding(int a) {
		i=i+a;
	}
	static int m3() {
		return i;
	}
	void m3p() {
		System.out.println(i);
	}
	void add(int a,int b) {
		System.out.println(a+b);
	}

	public static void main(String[] args) {
		Method1 obj=new Method1();
		System.out.println(Method1.i);
		Method1.adding(10);
		Method1.m3();
		obj.m3p();
		System.out.println(obj.po);
		
		int akt=obj.po;
		System.out.println(akt);
//		obj.m3p();
//		Method1.m2();
//		obj.m1();
//		System.out.println(i);
		

	}

}
