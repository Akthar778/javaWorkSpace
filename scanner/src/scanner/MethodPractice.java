package scanner;

public class MethodPractice {
	public static void name() {
		System.out.println("first method");
	}
	static void withoudPublic() {
		System.out.println("this is without public method");
	}
	public void num3() {
		System.out.println("only void method");
	}
	public void a() {
		System.out.println("a");
	}
	private void b(int c) {
		
		System.out.println(c);
	}
	void onlyvoid(int a,int b) {
		int c=a+b;
		System.out.println(c);
		
	}
	void balakrishna() {
		String actor="his actor comedy";
		int salary=100000;
		boolean good=true;
		String wife="not marrid";
		String isheactor=actor;
		System.out.println(actor+" "+salary+" "+good+" "+wife+" this all about him");
		
	}
	void add(int a,int b,String s) {
		int c=a*b;
		String k=s;
		System.out.println(c+k);
	}
	public static void main(String[] args) {
		MethodPractice amount=new MethodPractice();
		amount.add(10, 20, "k");
		amount.add(10, 1, "k");
		amount.add(10, 10, " amout");
		
	}

}
