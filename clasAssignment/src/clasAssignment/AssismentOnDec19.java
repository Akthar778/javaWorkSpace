package clasAssignment;
//to find largest number among two numbers//
//only if both number are positive numbers//


import java.util.Scanner;

public class AssismentOnDec19 {
	public class FirstAssiment {
			public static void main(String[] args) {
			Scanner objectt = new Scanner(System.in);
			System.out.println("enter first number in console\n");
			var i =objectt.nextInt();
			System.out.println("enter second number in console\n");
			var k=objectt.nextInt();
		    if (k>i) {
				System.out.println("largest number "+k);
				if (0<=i&&0<=k) {
			    	System.out.println("its a positive number");
					
				} else {
					System.out.println("its a negitive number");

				}
			} else {
				System.out.println("largest number "+i);
				if (0<=i&&0<=k) {
			    	System.out.println("its a positive number");
					
				} else {
					System.out.println("its a negitive number");

				}

			}
		    
			}

		}
}
