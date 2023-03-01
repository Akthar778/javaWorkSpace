package clasAssignment;

public class lcm {

	public static void main(String[] args) {
		//not getting output
		int a=9,b=7,i=1;
		int lcm=(a<b)?a:b;		
		while(i>0) {
			if(lcm%a ==0 && lcm% b==0) {
				System.out.println("The lcm of tow number is"+lcm);
	            break;		
			}
		lcm++;
		// it leads to a loop
		}


	}
                     
}
