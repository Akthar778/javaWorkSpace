package clasAssignment;//4 jan 2023

public class Factorial {
// 	04 jan
	public static void main(String[] args) {
		int fact=1,n=4;
		    
		for (int i = n; i >=1; i--) {
			fact*=i; 
		}
		System.out.println("factorial number of give number is "+fact);

	}

}
class Secfactorial{
	//write a program to calculate factorial of all the digits on a number
	public static void main(String[] args) {
		int rem=0,n=1234,fact;
		while(n>0) {
			fact=1;
			rem=n%10;
			for (int i=rem;i>=1;i--) {
				fact=fact*i;
			}
			n=n/10;
			System.out.println("the factorial of"+rem+"is"+fact);
			
		}
	}
}


//write a program to print all the prime numbers between the range one and hundred
//2nd question write a program to print all the spical numbers between the range one and hundred
//3rd question write a program to print all the perfect numbers between the range one and hundred