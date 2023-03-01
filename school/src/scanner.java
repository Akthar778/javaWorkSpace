import java.io.InputStream;
import java.util.Scanner;

public class scanner {

	public scanner(InputStream in) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner newmethod=new Scanner(System.in);
		System.out.println("enter num");
	    int stored = newmethod.nextInt();
		System.out.println("you enter"+stored);
		System.out.println("akthar ");
	}

	public char[] nextInt() {
		// TODO Auto-generated method stub
		return null;
	}

} 
class takingInputFromUser{
	public static void main(String[] args) {
		Scanner newname= new Scanner(System.in);
		System.out.println("enter string");
        String storeduserdata=newname.nextLine();
        System.out.println(storeduserdata);
	} 
}
class scannerp1{
	public static void main(String[] args) {
		scanner sc= new scanner(System.in);
		System.out.println(sc.nextInt());
	}
}