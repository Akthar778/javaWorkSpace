package clasAssignment;

public class SquareAndSum {
	//calculate the square and sum of the digits in a given number
	public static void main(String[] args) {
		int n=123, rem=0,sum=0;
		while(n>0) {
			rem=n%10;
			sum=sum+(rem*rem);
			n=n/10;
		}
		System.out.println(sum);
	}//correct output coming
}
