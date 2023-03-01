package objectsPractice;

public class object_pratice {
	int a=9;
	int b=8;
	static int c=8;
	static void m () {
		System.out.println("this is static method");
		m2 obj̥
	}
	void m2() {
		System.out.println("this is non static method");
	}
	public static void method () {
		
	}

	public static void main(String[] args) {
		
		object_pratice obj = new object_pratice()	;
		object_pratice obj2=obj;//here abject instalizing to obj2
		System.out.println(obj.a);
		obj2.a=12;
		System.out.println(obj2.a);
		
//		object_pratice obj3=obj;
//		System.out.println(obj.a);
		

	}

}
