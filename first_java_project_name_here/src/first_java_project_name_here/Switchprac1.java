package first_java_project_name_here;

public class Switchprac1 {
	public static void main(String[] args) {
		int i=1;
		switch (i) {
		case 1:
			System.out.println("enter one");
			break;

		default:
			System.out.println("enter two");
			break;
		}
	}

}
class switch2{
	public static void main(String[] args) {
		int mynumber=9;
		switch(mynumber) {
		case 1:
			System.out.println("1");
			break;
		case 2:
			System.out.println("2");
			default:
				System.out.println("neither you enter 1 nor 2");
				break;
		}
		
	}
}
