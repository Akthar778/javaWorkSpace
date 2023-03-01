package clasAssignment;

import java.util.Scanner;

class palindrom{
	public static void main(String[] args) {
		int n =121,rem,a=0,temp=n;
		while (n>0) {
			//4
			rem=n%10;

			a=10*10+rem;
			n=n/10;
		}
		if (temp==a) {
			System.out.println("palindrom");
		}
	}
}

class p2
{
	public static void main(String[]args){
	int n=191,rem=0; int tem=n,sum=0,div=0;

	while (n>0)
	{
		rem=n%10;
		sum=(sum*10)+rem;
		div=div/10;


	}
	if(sum== tem){
		System.out.println("palindrom");
	}


	}
}
class primemm{
	static int  a=0;
	public static void userinput(){
	
		System.out.println("this is method user input");
			Scanner sc = new Scanner(System.in);
			a = sc.nextInt();
			prime(	a);
			sc.close();		
	}
	static int count =0;
	public static void prime(int ab){
		for (int i = 0; i <= ab; i++) {
			if (ab%i==0) {
				count++;
			}
		}
		countt(count);
    }
	public static void countt(int a){
		if (a ==2) {
			System.out.println("prime number");
		}
		else{
			System.out.println("not prime number");
		}

	}
	
	public static void main(String[] args) {
		System.out.println("please enter the input");
		userinput();
	}
}
