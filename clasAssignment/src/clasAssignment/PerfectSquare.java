package clasAssignment;

import java.util.concurrent.ForkJoinPool;

public class PerfectSquare {
	public static void main(String[] args) {
		//2*2=4  3*3=9  4*4=16 is perfect square numbers
		//given number is perfect or not
		int n=16,count=0;
		for(int i=1;i<=n;i++) {
			if(i*i==n) {
				count++;
			}
			
		}
		if(count==1) {
			System.out.println(" your number is perfect,");
		}else {
			System.out.println("not a perfect square");
		}
	}

}
class perfectSquare2{
	//1 to 100 perfect square number
	public static void main(String[] args) {
	int count=0;
	for (int j = 1; j <= 100; j++) {
		
	
		System.out.println(j);
	
	for (int i = 1; i <= j; i++) {
		if (i*i==j) {
			count++;
		}
	}
	}
	if (count==1) {
		System.out.println("perfect square");
	}else {
		System.out.println("not a perfect square");
	}
	}
	
}
