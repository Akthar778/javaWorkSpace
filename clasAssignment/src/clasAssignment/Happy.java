package clasAssignment;

public class Happy{

	public static void main(String[] args) {
		int n=326,sum=0,rem=0;
		while(n>9)
		{
			rem=n%10;
			sum=sum+(rem*rem);
			n=n/10;
		}
		n=sum;
		sum=0;
		System.out.println(sum);
	
		if(n==1)
		{
			System.out.println("the number id happy ");	
		}
		else
		{
			System.out.println("the number is not happy");
		}
	}
}

		
		// TODO Auto-generated method stub

	


