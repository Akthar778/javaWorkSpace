package stringClassesP1;

public class StringClassPractice1 {

	public static void main(String[] args) {
		String s ="java";
		String s1=" java class";
		System.out.println(s.length());
		System.out.println(s.charAt(3));
		System.out.println(s.toString());
		char ch[]=s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			System.out.println(ch[i]);
		}
		System.out.println(s.indexOf('a'));
		System.out.println(s.lastIndexOf('a'));
		
		System.out.println(s.substring(2));
		System.out.println(s.substring(0, 4));
		
		String s4="this is java class";
		String s2[]=s4.split(" ");
		System.out.println(s2.length);
		
		System.out.println(s4.toUpperCase());
		System.out.println(s4.replace('t', 'c'));
		
	}

}
