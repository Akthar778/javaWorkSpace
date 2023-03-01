package com.StringPractice;

public class TotalCountOfNumber {

	public static void main(String[] args) {
		//get the total count of numbers listedin the
		//directory which is multiple of [1,2,3,4,5,6,7,8,9]
		//input [1,2,8,9,17,46,76,82,15,20,30]
		//out put [1:11,2:8;3:4,4:4,5:3,6:2,7:0,8:1,9:1]
		
		int count=0; int sum=0;
		int a[]= {1,2};
		for (int i=0;i<a.length;i++) {
			sum+=a[i];
			count++;
		}
		System.out.println(count+" "+ sum);

	}

}
class swap{
	public static void main(String[] args) {
		int a=1,b=3; int c=0;
//		c=a;
//		a=b;
//		b=c;
		
		a=a+b;
		b=a-b;
		a=a-b;
	
		System.out.println(a+" "+b);
	}
}
