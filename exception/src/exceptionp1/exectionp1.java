package exceptionp1;

public class exectionp1 {
	public static void main(String[] args) {
		
		System.out.println("method starts");
		try {
			if(0/7==0) {
				System.out.println("a and b");
			}
		}catch (Exception e) {
			System.out.println("this is catch block code");
			System.out.println(e.getMessage());
			System.out.println(e.toString());
		}finally {
			System.out.println("this is final block\n");
		}{
			
		}
		
		    System.out.println(" this is end of the progrqam");
		    for (int i = 0; i < 10; i++) {
				System.out.println("100 lines of code ...");
			}
		    
	}  

}
class exectionp2{
	public static int m1() {
		return 8;
	}
	public static boolean m2() {
		return true;
	}
	public static String m3() {
		System.out.println("inside the m3 method before the return type\n");
		return "akthar";
	}
	public static void m4() {
		System.out.println(m1()+" "+m2()+" "+m3());
	}
	public static void main(String[] args) {
		
		m4();
	}
}
