package clasAssignment;

public class SpecialCharactor {
	//write a program to checker weather given number is special number or not??

	public static void main(String[] args) {
		int n=144,fact,rem=0,sum=0,temp=n;
		while(n>10) {
			fact=1;
			rem=n%10;
			for(int i=rem;i>=1;i--) {
				fact=fact*i;
				
			}
			n=n/10;
			sum=sum+fact;
		}
		if(sum==temp) {
			System.out.println("special number");
		}else {
			System.out.println("not a spical charactor");
		}

	}

}
