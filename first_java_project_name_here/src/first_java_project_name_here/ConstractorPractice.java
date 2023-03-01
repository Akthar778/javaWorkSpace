package first_java_project_name_here;

public class ConstractorPractice {
	//creating variables//
	int a=1;
	String b="akt";
	String second ="akthar";
	 
	//going to create constractor//
	ConstractorPractice(int c,String d ,String st){
		a=c;
		b=d;
		second=st;
		
	}
	
	public static void main(String[] args) {
		                                              //going to give parametor instractions//
		ConstractorPractice obj=new ConstractorPractice(10, "replace constracot","niyaz");
		System.out.println(obj.a+obj.b);
		System.out.println(obj.second);
	}

}

class consprac2{
	int intt=1;
	float floatt=1.0f;
	
	public consprac2(int intpar,double d) {
		// TODO Auto-generated constructor stub
		intpar=intt;
		d=floatt;
		
	}
	
	public static void main(String[] args) {
		consprac2 obj=new consprac2(10, 11);
		System.out.println(obj.floatt);
		System.out.println(obj.floatt);
	}
}
class DefaltConstractor{
	int i=10;
	String b="akhtar";
	int intsec=1;
	String c="b";
	
	public static void main(String[] args) {
		DefaltConstractor obj = new DefaltConstractor();
		System.out.println(obj.i);
		System.out.println(obj.b);
		System.out.println(obj.c);
	}
	
	DefaltConstractor(){
		i=10;
		b="a";
		c="not possible to change";
	}
		
}
class constractor5{
	int i=15;
	
	public static void main(String[] args) {
		constractor5 obj= new constractor5()	;
		System.out.println(obj.i);
		
		
	}
	constractor5(){
		i=2;
	}
	constractor5(int intt){
		intt=i;
		i=10;
		System.out.println(i);
	}
}
class constractor44{
	public constractor44() {
		this(1);
		System.out.println("this is parent class constrator");	
	}
	public constractor44(int a) {
		this(10,20);
		System.out.println("parent class single parametor"+a);
		
	}
	public constractor44(int a, int b) {
		this("akthar");
		System.out.println("this is parent constracot im not calling in child class"+a+ " and "+b);
	}
	public constractor44(String s) {
		System.out.println("name is "+s);
	}
}
class constractor6 extends constractor44{
	public constractor6() {
		super();
		System.out.println("this is constractor beggining in parent class");
	}
	public static void main(String[] args) {
		constractor6 obj = new constractor6()	;
		
	}
}
