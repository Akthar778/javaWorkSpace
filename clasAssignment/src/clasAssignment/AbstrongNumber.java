package clasAssignment;

public class AbstrongNumber {

	public static void main(String[] args) {
		//0, 1, 153, 370, 371 and 407 are an Armstrong number list or all examples of Armstrong numbers. Let us check why? For 0, the operation is 0^1=0
		int n=3,temp=n,sum=0; 
		int rem =0;
		while(n>0) {
			rem=n%10;
			sum=sum+(rem*rem*rem);
			n=n/10;
			
		}
	   System.out.println(sum);
		if(temp==sum) {
			System.out.println("i'm amstron number");
		}else {
			System.out.println("im not a amstrong number");
		}

	}

}
