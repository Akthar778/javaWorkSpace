package first_java_project_name_here;

import java.util.Scanner;

public class NestedIfElse {
public static void main(String[] args) {
	int i=9;
	if (i==0) {
		System.out.println("i==0");
		int p=2;
		if (p==2) {
			System.out.println("i==2");
			
		} else {
			System.out.println("second negitive");

		}
	} else {
		System.out.println("none");

	}
}
}
class  interveiwCheck{
	static String status
	public static void main(String[] args) {
		if () {
			
		} else {

		}
	}
}
 class interviewCeking{
	public static void main(String[] args) {
		String interviewStatus=("pass");
		if (interviewStatus=="pass") {
			System.out.println("you have cleared round one");
			String secondRound=("pass");
			if(secondRound=="pass") {
				System.out.println("you have clear cleared your second round wait for 3rd round");
				String thordRound=("pass");
				if (thordRound=="pass") {
					System.out.println("you have cleared your thord tound wait for hr round");
					String HrRound=("pass");
					if (HrRound=="pass") {
						System.out.println("you have cleard your hr round");
						System.out.println("then we are youing to discuss salry discussion");
						
						int saralry=10000;
						switch (saralry) {
						case 8000:
							System.out.println("salry 8000 im not fine, im expecting more salry");
							break;
						case 9000:
							System.out.println("salary 9000 better then previous offer but im expecting more");
							break;
						case 1000:
							System.out.println("1100 im happy and ready to work");
							break;
							default:
								System.out.println("more then 1100 im happy");
								break;
						}
					
						
					}else {
						System.out.println("you have not clear hr round");
					}
					
					
					
				} else {
					System.out.println("you have not selected on thord round soory");

				}
			}
			else {
				System.out.println("sorry you have not cleard your second round");
			}
		}
		else {
			System.out.println("go to home you are not selected");
		}
	}
}
 class takingInputFromUser{
	 public static void main(String[] args) {
		Scanner scannerObj=new Scanner(System.in);
		String userstrindDataStoredHere=scannerObj.nextLine();
		System.out.println("you enter "+userstrindDataStoredHere);
		if (userstrindDataStoredHere=="akthar") {
			System.out.println("in if akthar");
		} else {
			System.out.println("this is else");

		}
		
	}
 }
 class ifelse{
	 public static void main(String[] args) {
		 int i=7;
		if (i==1) {
			System.out.println("i==1");
		} else {
			System.out.println("noneee");

		}
	}
 }
 class stringtest{
	 public static void main(String[] args) {
		String s=("string");
		if (s=="string") {
			System.out.println("this is string");
		}
		else {
			System.out.println("this is else");
		}
	}
 }
 class TakingIffobyUser{
	 public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		String objs=obj.nextLine();
		if (objs=="akthar") {
			System.out.println("akthar is typing");
		} else {
			System.out.println("except akthar ");

		}
		
	}
 }
 class takingtest{
	 public static void main(String[] args) {
		System.out.println("akthar");
	}
 }

