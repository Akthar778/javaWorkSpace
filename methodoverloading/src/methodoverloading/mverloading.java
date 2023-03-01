package methodoverloading;
class m{
	void p() {
		System.out.println("this is p one");
	}
}
class m2 extends m{
	void p() {
		super.p();
		System.out.println(" this is p 2");
		System.out.println(" im implementing here");
	}
}
public class mverloading {
     public static void main(String[] args) {
		m2 obj = new m2();
		obj.p();
	}
}
class rafdal2 {
	int z=10;
	void m() {
		System.out.println(this.z);
	}
	void m(int a) {
		this.z=a;
		System.out.println(z);
	}
}
class rafdel extends rafdal2 {
	
	public static void main(String[] args) {
		rafdel obj= new rafdel();
		rafdal2 obj2= new rafdal2()	;
		obj2.m();
		obj2.m(20);
		
	}
}
class raf2{
	int ss=88;
	static int ii=8;
	int a=8;
	static  int b=77;
	public static void main(String[] args) {
		raf2 obj = new raf2();
		obj.a=88;
		System.out.println(obj.a);
		raf2.b=99;
		System.out.println(b);
	}
}
class raf3{
	public static void main(String[] args) {
		raf2 obj = new raf2();
		System.out.println(obj.ss);
		obj.ss=12;
		System.out.println(obj.ss);
		
	}
}
class raf4{
	static {
		System.out.println("K");
	}
	{
		System.out.println("this is non static block");
	}
	int a=9;
	public static void main(String[] args) {
		raf4 obj = new raf4();
		raf4 obj2= new raf4();
		raf4 obj3=obj2;
		System.out.println(obj3.a);
		obj2.a=89;
		System.out.println(obj.hashCode());
		System.out.println(obj.a);
		System.out.println(obj2.a);
		System.out.println(obj2.hashCode());
	}
}
class raf5{
	static {
		System.out.println("this is static block");
	}
	{
		System.out.println("this is non static block");
		{
			System.out.println("this is second non static blcok");
		}
	}
	public static void main(String[] args) {
		raf5 obj = new raf5();
	}
}
class raf6
{
	String s="qspider";
	public static void m1() {
		System.out.println(" trainers");
	}
	public void m3() {
		System.out.println(" trainers");
	}
}
class raf7 extends raf6
{
	String p=" jspider";
	public static void m2()
	{
		System.out.println("trainers");
	}
	public static void main(String[] args) {
		raf7 obj= new raf7();
		raf6 obj2= new raf6();
		obj2.m3();
		obj.m1();
		System.out.println(obj.s);
		obj.m1();
		System.out.println(obj.p);
		m2();
	}
}
class method_overloading{
	public void m1() {
		System.out.println("this is method over loading");
	}
	public void m1(int a) {
		System.out.println("parametor method");
	}
}
class mettho_overloading2{
	public static void main(String[] args) {
		method_overloading obj = new method_overloading();
		obj.m1();
		obj.m1(7);
	}
}
