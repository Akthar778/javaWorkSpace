package methods;
import java.util.Scanner;

public class Factorial {
	static int factorialm1 (int num) {
		if(num==0) {
			return 1;
		}else {
		   return (num*(num-1));
		}
	}
	public static void main(String[] args) {
		Scanner inputstored= new Scanner (System.in);
		System.out.println("please enter user name");
		int c = inputstored.nextInt()	;
		int b=factorialm1(c);
		int ff=9;
		System.out.print(ff);

	}

}
