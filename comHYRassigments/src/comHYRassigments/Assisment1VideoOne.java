package comHYRassigments;

import java.util.Scanner;

public class Assisment1VideoOne {

	public static void main(String[] args) {
		System.out.println("enter today in the form of text\n");
		Scanner scanner=new Scanner(System.in);
		String input=scanner.nextLine();
		
		
        if (input.equals("monday")||
        		input.equals("friday")||
        		input.equals("wendsday")||
        		input.equals("tuesday")
        		) {System.out.println("this is working day huff...");
        
			
		}else if (input.equals("sunday")||
				input.equals("satarday")) {
			System.out.println("this is weeked enjoy...");
		}
			{
		}
	}

}
class assisment2{
	public static void main(String[] args) {
		//requirement student pass fail taking from input from the teachers
		System.out.println("enter marks of the student");
		Scanner teacherInput = new Scanner(System.in);
		int studentMarks=teacherInput.nextInt()	;
		if(studentMarks<=35) {
			System.out.println("his just pass");
		}else if(studentMarks<=50) {
			System.out.println("he second class");
		}else if (studentMarks<=100) {
			System.out.println("great he got a first class .... ");
		}else {
			System.out.println("please enter a vaild data");
		}
		teacherInput.close();
	}
}
