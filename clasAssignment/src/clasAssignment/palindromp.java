package clasAssignment;

import java.util.Scanner;

public class palindromp {

	public static void main(String[] args) {
		int n=121;
		int r,sum=0,temp=n;
		while(n>0) {
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		if(temp==sum) {
			System.out.println("palindrom number");
		}else {
			System.out.println("not a palindrom number");
		}

	}

}
class palindrompractice2{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int input=sc.nextInt()	;		
		int rem=0,sum=0,temp=input;
		while(input>0) {
			rem=input%10;
		    sum=(sum*10)+rem;
		    input=input/10;      
		}
		if(temp==sum) {
			System.out.println("palindrom");
		}
	}
}
class palindromprac3{
	public static void main(String[] args) {
		int n=12344321,rem=0,tem=n,a=0;
		
		while (n>0) {
			a=n%10;
			rem=rem*10+a;
			n=n/10;
		}
		if(tem==rem) {
			System.out.println("palindrom");
		}
	}
}
class test{
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.println(i+1);
		}
	}
}



