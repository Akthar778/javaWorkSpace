

public class ExtractDigits {

	public static void main(String[] args) {
		
		int n=1234765,rem=0;
		while (n>0) {
			rem=n%10;
			System.out.println(rem);
			n=n/10;	
		}
		
	
	}
}

