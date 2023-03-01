package clasAssignment;

public class FactorsP {

	public static void main(String[] args) {
		int n=10;
		for (int i = 1; i <= n; i++) {
			if(n%i==0) {
				System.out.println(i);
			}
		}

	}

}
class perfectp2{
	public static void main(String[] args) {
	    int n=19;
	    int sum=0;
	    for (int i = 1; i <= n; i++) {
			if(n%i==0) {
				sum=sum+i;
			}
		}
	    if(sum==n) {
	    	System.out.println("prime number ");
	    }
	}
}
