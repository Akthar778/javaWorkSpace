package methodPractice1;

public class methodpractice1 {
	public static void m1() {
		System.out.println("hello good morning");
	}
	public static void m1(int a) {
		System.out.println("the passing argument number is ="+a);
	}
	
	public static int m2(int b) {
		System.out.println(b);
		m3();
		return 8;
	}
	int b;
	public static int m3 () {
		return 77;
	}
	
	
    public static void main(String[] args) {
		m1();
		m1(9);		
		m2(7);
		m3();

	}

}
class methodoverloadingp2{
	void m1() {
		System.out.println("this is m1");
	}
	void m2() {
		System.out.println("method 2 implementation");
	}
	public static void m3() {
		System.out.println("this is the method 3 without implemenation here");
	}
	public static int m4() {
		System.out.println("this is m4");
		return 8;
	}
	public static void m5() {
		System.out.println("this is unchanged m5 method in m5");
	}
	public static void m5(int a) {
		System.out.println("this is override in same class");
	}
	public static void main(String[] args) {
		m5();
	}
}
class methodoveloading3 extends methodoverloadingp2{
	public static void m5() {
		System.out.println("we can change the implemation of static method");
	}
	void m1() {
		System.out.println("method 2 is changing here");
	}
	public static void m3() {
		System.out.println("method 3 is changing know");
	}
	public static void main(String[] args) {
	   methodoveloading3 obj = new methodoveloading3()	;
	   methodoveloading3.m5();
	   obj.m4();
	   obj.m1();
	   obj.m2();
	   obj.m3();
	}
}
