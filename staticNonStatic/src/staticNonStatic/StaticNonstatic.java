package staticNonStatic;

public class StaticNonstatic {

	public static void main(String[] args) {
		System.out.println("akthar");
	}
}

class stringtest{
	static int num;
	static void add(int nume) {
		num=nume+num;
	}
	static int stored() {
		return num;
	}
	static void a() {
		System.out.println(num);
	}
	public static void main(String[] args) {
	
	}
	
}
class class_name{
	int a=10;
	static int b=20; 
	static void staticMethod() {
		System.out.println("this is static method  "+b);
	}
	void nonstaticMethod() {
		System.out.println("this is nonstatic method "+a);
	}
	public static void main(String[] args) {
		class_name object = new class_name();
		class_name.staticMethod();
		object .nonstaticMethod();}
}
class class_name2{
	int nonstaticnum=10;
	static int staticnum=100;
	static void staticMethod() {
		System.out.println(staticnum);
	}
	void nonsstaticm(){
		System.out.println(nonstaticnum);
	}
	public static void main(String[] args) {
		class_name2.staticMethod();
		class_name2 obj = new class_name2()	;
		obj.nonsstaticm();		
	}
}
class Class_3{
	int nonstatic=10;
	static int staticnum=100;
    static void staticMethod() {
    	System.out.println(staticnum);
    }
    void nonstaticMethod() {
    	System.out.println(nonstatic);
    }
	public static void main(String[] args) {
		Class_3 obj = new Class_3();
		obj.nonstaticMethod();
		Class_3.staticMethod();
	}
}
