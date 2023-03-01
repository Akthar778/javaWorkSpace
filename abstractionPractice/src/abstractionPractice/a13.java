package abstractionPractice;

public class a13 extends a12{
	public static void main(String[] args) {
		a13 obj = new a13();
		obj.add();
		obj.substraction();
	}

	@Override
	public void substraction() {
		System.out.println("this is substation method"+(98-7));
		
	}

}
