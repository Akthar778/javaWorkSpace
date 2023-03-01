package scanner;

import java.util.Scanner;

public class Scannerpra1 {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("enter first name");
		String first=obj.nextLine();
		System.out.println("enter second name");
		String second=obj.nextLine();
		if (first==second) {
			System.out.println("theft");
			
		} else {
			System.out.println("not theft");
		}

	}
}
