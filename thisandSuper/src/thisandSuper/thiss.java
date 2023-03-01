package thisandSuper;

public class thiss {
	int a;
	void m() {
		System.out.println(this.a);
	}
	void m(int b) {
		this.a=b;
		System.out.println(b);
		System.out.println("this is parametor method");
	}

	public static void main(String[] args) {
		thiss obj = new thiss();
		obj.m();
		obj.m(8);

	}

}
class thisp{
	
	int a=12;
	int k;
	thisp(){
		k=87;
	}
	void n (){
		System.out.println(a);
	}
	int b=99;
	
}
class thisp2  {
	public static void main(String[] args) {
		thisp obj = new thisp();
		obj.n();
		System.out.println(obj.b);
		System.out.println(obj.k);
	}
}
