
public class Scanner {
	int i = 0;
	String s;
	boolean b;
	float f;

	Scanner(){
		i=100;
		f=10.0f;
	}
	Scanner(int i){
		this.i=i;
	}

	public static void main(String[] args) {
		Scanner objscanner = new Scanner();
		Scanner objscanner2 = new Scanner(10);

		System.out.println(objscanner==objscanner2);
	}

}
