package encapsoulationp;

public class encapsoulationp1 {
	private int a=0;
	public void setb(int c) {
		a=c;
	}
	public int getb() {
		return a;
	}
	public static void main(String[] args) {
		
	}

}
class encapsoulationp2{
	
	public static void main(String[] args) {
		encapsoulationp1 obj = new encapsoulationp1 ();
		obj.setb(10);
		System.out.println(obj.getb());
		obj.setb(20);
		System.out.println(obj.getb());
	}
	 
 }

class encapsoulationp3{
	 private int i=0;

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}
	 
}
class encapsoulationp4{
	public static void main(String[] args) {
		encapsoulationp3 obj = new encapsoulationp3();
		obj.setI(8);
		System.out.println(obj.getI());
	}
}