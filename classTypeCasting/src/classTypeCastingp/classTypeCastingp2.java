package classTypeCastingp;

public class classTypeCastingp2 extends classTypeCastingp1 {
	void m2() {
		System.out.println("this is m2 in class 2");
	}

	public static void main(String[] args) {
//		classTypeCastingp2 obj= new classTypeCastingp2();
//		obj.m2(); obj.m1();
		classTypeCastingp1 obj2= ( classTypeCastingp1 ) new classTypeCastingp2();
		obj2.m1();
//		obj2.m2();
		System.out.println(obj2.a);

	}

}
