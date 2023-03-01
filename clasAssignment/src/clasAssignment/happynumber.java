package clasAssignment;

public class happynumber {

	public static void main(String[] args) {
		//happy number
		int n=97,rem=0,sum=0;
		while (n>9) {
			rem=n%10;
			sum=sum+rem+rem;
					n=n%10;
					sum=0;
		}
		System.out.println(sum);

	}

}
