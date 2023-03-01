package clasAssignment;

public class SumOfExtractedDigtis {
	public static void main(String[] args) {
		//sum of extracted digits from given number
		int n=122,rem=0,sum=0;
		while(n>0) {
			rem=n%10;
			sum=sum+rem;
			n=n/10;
		}
		System.out.println(sum);
	}//correct output

}
class Secondproblem{
	//print the square of extracted digits from a number
	public static void main(String[] args) {
		int n=1234;
		int rem=0;
		while(n>0) {
			rem=n%10;
			System.out.println(rem*rem
					);
			n=n/10;
		}
	}
}
