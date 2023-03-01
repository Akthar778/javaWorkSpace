package com.StringPractice;

import java.util.Arrays;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string="hello";
		String s2="hellO";
		String s3="how are you ";
		String intt="189";
		int i=Integer.valueOf(intt);
		int p=100;
		String changeDataintoString=String.valueOf(false);
//		System.out.println(i+p);
		String name=String.valueOf(p);
		System.out.println(name);
		
		int r=10;
		String s= String.valueOf(r);
		System.out.println(s);
		s="akthar";
		System.out.println(s);
		System.out.println(s.substring(1,6));
		System.out.println(s.substring(3,4));
		System.out.println(s.charAt(0));
		var=1;
		System.out.println(var);
		
		
		
		System.out.print(pp instanceof Integer);
		
		
		System.out.println(s3.charAt(8));
		System.out.println(s3.indexOf("o"));
		System.out.println(s3.lastIndexOf("you"));
		System.out.println(s2.contains("l"));
		System.out.println(s2.trim());
		System.out.println(s2.toLowerCase());
		System.out.println(s2.toUpperCase());
		System.out.println(s2.length());
		System.out.println(s2.equals(string));
		System.out.println(string.equalsIgnoreCase(s2));
		System.out.println(s2.indent(5));
		System.out.println(s2.indexOf("l"));
		System.out.println(s2.indexOf("O"));
		System.out.println(s3.substring(0,3));
		System.out.println(s3.split(s3));
		System.out.println(s2.lastIndexOf("l"));
		System.out.println(Arrays.toString(s3.split(" ")));
		System.out.println(s2.toCharArray());
		

	}

}
