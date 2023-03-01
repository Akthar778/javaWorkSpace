import java.util.ArrayList;
import java.util.Iterator;

public class arrayListp2 {
	public static void main(String[] args) {
		ArrayList a1 = new ArrayList();
		a1.add("this is string");
		a1.add('a');
		a1.add('b');
		a1.add(false);
		a1.add(78);
//		for (int i = 0; i < a1.size(); i++) {
//			if(a1.get(i)instanceof object) {
//				System.out.println(a1.get(i));
//			}
	
		
		for (Object object: a1) {
			if(object instanceof Boolean) {
				System.out.println(object);
			}
		}
		
		
		
		for (Integer integer : a1) {
			if (integer %2==0) {
				System.out.println(integer);
			}
		}
		
		 

		
	}

}
