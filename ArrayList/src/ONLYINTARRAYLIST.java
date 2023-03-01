import java.util.ArrayList;

public class ONLYINTARRAYLIST {
	public static void main(String[] args) {
		ArrayList<Integer> a1=new ArrayList<Integer>();
		ArrayList<Integer> a2=new ArrayList<Integer>();
		
		
		a2.add(3);
		a2.add(88);
		a2.add(7);
		a2.add(2);

		a1.add(3);
		a1.add(88);
		a1.add(7);
		a1.add(2);
//		ArrayList<Integer> a4=new ArrayList<Integer>();
//		a2.add(3);
//		a2.add(88);
//		a2.add(7);
//		a2.add(2);
//		ArrayList<Integer> a3=new ArrayList<Integer>();
//	    a3.addAll(a1);
//	    a3.addAll(a2);
//	    a3.addAll(a4);
//	    System.out.println(a3);
	    
	    for (Integer obj : a1) {
			if (obj %2==0) {
				System.out.println(obj);
			}
		}
	    for (Integer refname : a1) {
			System.out.println(refname);
		}
	    
	    
		
		

		
		
//		al.add((int) 'h');
//		for (int i = 0; i < a1.size(); i++) {
//		if(a1.get(i)instanceof Integer) {
//			System.out.println(a1.get(i));
//		}
		
//		for (Integer integer : a1) {
//			if (integer %2==0) {
//				System.out.println(integer);
//			}
//			output 88 22
//		}
		
		
	}
	

}
