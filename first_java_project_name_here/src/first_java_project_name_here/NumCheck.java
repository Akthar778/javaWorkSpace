package first_java_project_name_here;
import java.util.Scanner;

public class NumCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter number");
		Scanner newobj=new Scanner(System.in);

		
		int stored1=newobj.nextInt();
		
		
		if (stored1==1) {
			System.out.println("you enter 1 and enter any number 2");
			int inif = newobj.nextInt();
			
			if (inif==2) {
				System.out.println("you enter 2");
				int inif2=newobj.nextInt();
				if (inif2==3) {
					System.out.println("you enter 3");
					int infi3=newobj.nextInt();
					if(infi3==4) {
						System.out.println("you enter 4");
					} else {
						System.out.println("4 loop end here");
					}
					
				} else {

				}
				
			} else {

			}
			
		} else {

		}
		

	}

}
