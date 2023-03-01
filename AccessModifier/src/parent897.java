
public class parent897 {
	public static void myname() {
		System.out.println("akthar this is parent 897 class my name method name");
	}
	public int par897var=19;
	public parent897() {
		par897var=99;
	}
	

	public static void main(String[] args) {
		parent897 obj =new parent897()	;
		
	
		System.out.println(obj.par897var);
		

	}

}
class publiccx{
	public int a=99;
	public int c=0;
	public static void method() {
		System.out.println("this is method");
	}
	public publiccx() {
		c=787;
	}
	public static void main(String[] args) {
		publiccx obj = new publiccx()	;
		System.out.println(obj.a);
		method();
		System.out.println(obj.c);
	}
}
