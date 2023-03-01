
public class poop {
	public static void m1() {
		System.out.println("full name");
	}
	void m2() {
		System.out.println("only void m2");
	}
	void m3(int a,int b) {
	System.out.println(a+" "+b);
	}
	public static int returnn () {
		int a=19;
	    return a;
	}
	int test() {
		return 9;
	}


	public static void main(String[] args) {
		poop obj = new poop();
		obj.m4n1();
		obj.m3(5, 8);
		int c=returnn();
		int testt=obj.test();
		System.out.println(c+" after");
		System.out.println("obj stored in variable "+c);
		
		

	}
	static int q=8;
	static int m4() {
		return q;
	}
	void m4n1(){
		System.out.println(q);
	}

}
