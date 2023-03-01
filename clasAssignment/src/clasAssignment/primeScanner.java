package clasAssignment;

import java.util.Scanner;

public class primeScanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("print any prim number sir");
		int stored = sc.nextInt();
		int count =0;
		for (int i = 0; i<= stored; i++) {
			if(stored%i==0) {
				count ++;
			}
			
		}
		if(count == 2) {
			System.out.println("prime ");
		}else {
			System.out.println("not prime");
		}
		

	}

}
