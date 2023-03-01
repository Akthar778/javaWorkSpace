
import java.util.Scanner;

public class primem {
	static int count =0;
	
	public static boolean tr() {
		if (count ==2) {
			return true;
		}else {
			return false;
		}
		
	}
	public static void prime() {
		Scanner obj = new Scanner (System.in);
		int n= obj.nextInt();
		for (int i = 0; i <= n; i++) {
			if (n%2==0) {
				count++;
			}
		}
		tr();
		
	}
	public static void main(String[] args) {
		prime();
	}

}