package methodoverloading;


public class method_over_RIDING extends MethodOverloadingP3{
	public void m1() {
		System.out.println("override the method");
	}
	public void m1(int a) {
		System.out.println("parametorsied method");
	}
	
	public static void main(String[] args) {
		MethodOverloadingP3 obj2 = new MethodOverloadingP3();
		obj2.m1();
		method_over_RIDING obj = new method_over_RIDING();
		obj.m1();
		obj.m1(8);
	}
}
 class MethodOverloadingP3 {
	public void m1() {
		System.out.println("thid is parent class m1 method");
	}

}
 
