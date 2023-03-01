package school;

import java.util.Scanner;

public class InputFromUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scannermethodName = new Scanner(System.in);
		System.out.println("enter any number");
		int intname=scannermethodName.nextInt();
		System.out.println(intname);
		
		System.out.println("int second number ");
		int intname2=scannermethodName.nextInt();
		System.out.println("int thord number ");
		int intname3=scannermethodName.nextInt();
		
		int total=intname+intname2+intname3;System.out.println("total value");
		System.out.println(total);
				
	}
	

}
class inputFromUser2{
	public static void main(String[] args) {
		Scanner scannerObject = new Scanner(System.in);
		System.err.println("enter string");
		String stringmethodNameString=scannerObject.next();
		System.out.println(stringmethodNameString+ "this is string");
		
	}
}
class inputfromuser3Class{
	public static void main(String[] args) {
		Scanner scannerobj= new Scanner(System.in);
		boolean stored=scannerobj.nextBoolean()	;
		System.out.println(stored);
		
		
	}
}
class formatedstring{
	public static void main(String[] args) {
		int i=10;
		int i2=20;
		String s="akthr";
		System.out.printf("%d%n%d%n%s ",i,i,s);
	}
}

class name{
	public static void main(String[] args)   
	{  
	Scanner sc = new Scanner(System.in);  
	System.out.print("Please enter the number of strings you want to enter: ");   
	//takes an integer input         
	String[] string = new String [sc.nextInt()];      
	//consuming the <enter> from input above  
	sc.nextLine();   
	for (int i = 0; i < string.length; i++) 
	{  
	string[i] = sc.nextLine();  
	}  
	System.out.println("\nYou have entered: ");  
	//for-each loop to print the string  
	for(String str: string)   
	{  
	System.out.println(str);  
	}  
	}  
}

