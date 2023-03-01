package clasAssignment;

import java.util.Iterator;

public class primenumberr {

	public static void main(String[] args) {
		int n=3,count = 0;
		for (int i = 1; i <=n; i++) {
			if(n%i==0) {
				count++;
				
			}
			
		}
		if(count==2) 
			System.out.println("its a prime number");
		else 
			System.out.println("its not a ptime number");
		

	}

}
class intcheck {
	public static void main(String[] args) {
		int i=0;
	 for (; i <= 200 ;i++) {
		if(i%2==0)
			System.out.println(i);
	 }
	
	}
		
	
}

