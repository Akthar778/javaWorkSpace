import java.util.Scanner;
class primemmm{
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
		for (int i = 1; i <= ab; i++) {
			if(ab%i ==0){
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