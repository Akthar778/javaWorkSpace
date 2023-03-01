package clasAssignment;
import java.util.Scanner;

public class scannerProblem {
	public static String readString() {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the string");
		String s=sc.next();
		return s;
	}
	public static void printString(String s1) {
		System.out.println("the string is :"+s1);
	}
	

	public static void main(String[] args) {
	    String s1=readString();
	    System.out.println(s1);

	}

}
