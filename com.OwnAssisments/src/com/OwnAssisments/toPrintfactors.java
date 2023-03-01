package com.OwnAssisments;

public class toPrintfactors {


	
	
public static void main(String[] args) {
		int n=80;
		for (int i = 0; i <= n; i++) {
			if (i%n==0) {
				System.out.println(n);
			}
		}

	}

}
class primeNumberp{
public static void main(String[] args) {
		int n=45,count=0;
		for(int i=1;i<n;i++) {
			if(n%i==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.println("perfect number");
		}
	}
}
class perfectnumberpractice{
	public static void main(String[] args) {
		int n=45,sum=0;;
		for(int i=1;i<n;i++) {
			if(n%i==0) {
				sum=i+sum;
			}
		}
		if(sum==n) {
			System.out.println("perfect number");
		}
	}
}

class factorsOnly{//factors finding
	public static void main(String[] args) {
		int n=11;
		for (int i = 1; i <=n; i++) {
			if(n%i==0) {//this line is change only
				System.out.println(i);
			}
		}
	}
}


class onetohundred{
	public static void main(String[] args) {
		for(int i=0;i<=100;i++) {
			System.out.println(i);
		}
	}
}

class a{
	public static void main(String[] args) {
		for (int i = 0; i <= 10; i++) {
			if(i%3==0) {
				System.out.println(i);
			}
		}
	}
}


class MinusToPlus{
	public static void main(String[] args) {
		for(int i=-5;i<=5;i--) {
			System.out.println(i);
		}
	}
}
class mobilenotworking{
	public static void main(String[] args) {
		var count=0;
		for (int i=0; i<10; i++) {
			System.out.print(i +" ");
			
			count++;
		}
		
		System.out.println(count);
		
	}
	
}
class atozz{
	public static void main(String[] args) {
		for(char i='a';i<'z';i++) {
			System.out.print(i);
		}
	}
}




class factor{
	public static void main(String[] args) {
		int number=11;
		for(int i=1;i<=number;i++) {
			if(number%i==0) {
				System.out.println("even "+i);
			}
		}
	}
}
class factortype2{
	public static void main(String[] args) {
		var n=6;
		for (int i = 1; i < 10; i++) {
			if (n%i==0) {
				System.out.println(i);
			}
		}
	}
}
class oneto100evennumberr{
	public static void main(String[] args) {
		System.out.println("only even numbers only");
		for (int i = 0; i < 100; i++) {
			if(i%2==0&& i%3==0) {
				for (int j = 0; j < 2; j++) {
					System.out.print(i+" ");
					if(i%5==0) {
						System.out.println("this is divishable by 5"+" " +i+ " ");
					}
				}
			}
		}
	}
}