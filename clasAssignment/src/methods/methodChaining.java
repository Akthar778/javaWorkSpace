package methods;

import java.util.Scanner;

public class methodChaining {
	
	public static void readString() {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the string");
		String s=sc.next();
		printString(s);
	}
	public static void printString(String a) {
		System.out.println("the string is "+a);
	}

	public static void main(String[] args) {
		readString();

	}

}
class method2nd{
	public static void reading_values() {
		Scanner sca=new Scanner(System.in);
		System.out.println("enter the int");
		int a= sca.nextInt();
		System.out.println("enter the string");
		String b=sca.next();
		dubpilicate(a,b);
		
		
		
	}
	public static void dubpilicate(int a, String b) {
		System.out.println("ths string is %d athe inter is "+a+b);
	}
	public static void main(String[] args) {
//		reading_values();
		int a =18;
        String s="akt  ";
        System.out.printf("Hello, World!%d%s    ",a);
	}
	
}
class chainmethods1{
	public static void calling1() {
		System.out.println("calling method one");
		calling2();
		
	}
	public static void calling2() {
		System.out.println("calling method two");
	}
	public static void main(String[] args) {
		calling1();
	}
}
class classmethod{
	int mname (int a,int b){
		int c=a+b;
		return c;
		
	}
	static int ii;
	classmethod(int cc,int dd) {
		System.out.println(cc+dd);
		int defaultvalur=999;
	}
	classmethod() {
		int ii=199;
	}
	
	public static void main(String[] args) {
		classmethod obj = new classmethod(2,2)	;
		int a=obj.mname(10, 10);
        	System.out.println(ii);
	}
}
class classmethod2{
	int mname(int a) {
		System.out.println(a);
		return 9;
	}
	public static void main(String[] args) {
		method2 obj=new method2();
		int a= obj.mname(88);
		System.out.println(a);
	}
}
class method3practice{
	//method chaining one of the good example
	static void m1() {
		System.out.println("m1 im");
		m2(10);
	}
	static void m2(int a) {
		System.out.println("m2 im"+" "+a);
		
		int m3i=m3();
		System.out.println("m3i "+" "+m3i);
	}
	static int m3 () {
		System.out.println("m3 im");
		return 20;
	}
	public static void main(String[] args) {
		m1();
	}
}
