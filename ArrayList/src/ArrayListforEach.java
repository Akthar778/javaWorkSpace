import java.util.ArrayList;

public class ArrayListforEach {

	public static void main(String[] args) {
		ArrayList a= new ArrayList();
		a.add("string");
		a.add(123);
		a.add(true);
		a.add(1.2334343);
		a.add(2);
		for (Object object : a) {
			System.out.println(a);
			break;
		}
		
	ArrayList<Integer> b= new ArrayList<Integer>();	
	b.add(7);
	b.add(6);
	b.add(7);
	b.add(6);
		for (Integer integer : b) {
			System.out.println(b);
			break;
		}
		
//		for(Object ref : a) {
//			System.out.println(ref);
//		}

	}

}
