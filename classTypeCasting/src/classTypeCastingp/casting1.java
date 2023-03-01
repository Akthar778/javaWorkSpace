package classTypeCastingp;

public class casting1 extends casting {
	static int a=9;
	public void m2() {
		System.out.println("this is m2 method");
	}
	public static void main(String[] args) {
		  
		casting ob= new casting1();
//		casting obj= (casting)new casting1();
		
		casting1 obj2=(casting1)obj;
		
		
    }

}
