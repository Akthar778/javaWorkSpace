package clasAssignment;

public class countNumberGivenNumb {
	public static void main(String[] args) {
		int n=1123343434,remainder=0,count=0;
		while(n>0) {
			remainder=n%10;
			count++;
			n=n/10;
		}
		System.out.println(count);
	}

}
{}