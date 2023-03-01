package blocks;
public class block1 {
	int a=9;
	String st="this is string non static";
	static int b=100;
	public static void staticm() {
		System.out.println("static method");
	}
	public        void nonstatic() {
		System.out.println("non static method");
	}
	static {
		System.out.println("this is static method");
	}
	{
		System.out.println("non static method");
	}
	public static void main(String[] args) {
		block1 obj = new block1();
		System.out.println(obj.a+obj.st);
		System.out.println(block1.b);
		
	}
	public static int cc=88;

}

