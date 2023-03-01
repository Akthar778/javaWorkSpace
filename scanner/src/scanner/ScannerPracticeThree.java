package scanner;

import java.util.Scanner;

public class ScannerPracticeThree {

	public static void main(String[] args) {
	
		Scanner scanner=new Scanner(System.in);
		int a=scanner.nextInt();
		int b=scanner.nextInt();
		if (a<b) {
			System.out.println("a is greter then b");
			if (a+b<100) {
				System.out.println("100 kanna takkuva");
				if (a+b<=99) {
					System.out.println("99kanna takuva unai");
					if (a+b<=80) {
						System.out.println("less then 80");
					} else {
						System.out.println("greter then 80");

					}
				} else {
					System.out.println("99 kanna yekuva unai");

				}
			} else {
				System.out.println("100 kanna yekkuva undi");
				

			}
		} else {
            System.out.println("a is less then b");
		}
	}

}
