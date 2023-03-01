package constractorCallingp;

public class ConstractorCap2 {
	ConstractorCap2(){
		int a=8;
		System.out.println(a);
		System.out.println("this is first constractor");
	}
	ConstractorCap2 (int a){
		this();
		System.out.println("this is second constractor");
	}
	ConstractorCap2(int b ,int bc){
		this();
		System.out.println("this is thord constracor");
	}

	public static void main(String[] args) {
		ConstractorCap2 obj = new ConstractorCap2(3,8);
		

	}

}
