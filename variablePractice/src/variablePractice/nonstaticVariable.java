package variablePractice;

public class nonstaticVariable {
	
        static int svariable=9;
               int nonstaticVariable=99;
               boolean add(int a,int b) {
            	   System.out.println(a+b);
               }
              
	public static void main(String[] args) {
nonstaticVariable obj = new nonstaticVariable()	;
	//	svariable(); this is also wrong
//		nonstaticVariable();//this is wrong
		
		//object ni manam sysout lo create chyavachu
		//System.out.println(new nonstaticVariable().nonstaticVariable);
//		obj.add(10, 20);
//		System.out.print(new nonstaticVariable().add(10, 20));
		
		
		
	}

}
