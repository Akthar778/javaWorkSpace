package interfacep;

public class Hpp implements laptop {

	public static void main(String[] args) {
		Hpp obj=new Hpp();
		obj.ram();

	}

	@Override 
	public void process() {
		System.out.println("i5 minimm");
		
	}

	public void ram() {
		// TODO Auto-generated method stub
		System.out.println("8 gb ram");
		
	}
	@Override
	public void rom() {
		// TODO Auto-generated method stub
		System.out.println("1tb hard disk");
		
	}

	
	public void extra() {
		System.out.println("extra futures in hp");
	}

}
