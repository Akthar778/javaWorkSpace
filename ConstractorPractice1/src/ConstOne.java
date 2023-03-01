
//constracor
//obj create chesey tappodey call chestam
//.class lopala memory opeations constractor lo chestam 
//.constracto name class name ney undali.
//.return type aneydi constactir ki undadu(like void)
//.defalt constractor defalt constrcors yeppodu kuda public gaaney untai (public)
//.yeppodu ayetey nuvvu constractor ni estavo enka java constracor add cheyadu emplecit constracor.
//.f3 ni press chesi check chosokovachu yekka pointavutundi ani
//.n numbers of contractor ni create cheyavachu yala antye parametor ni change chesi denin paramitarised constracor antam .
//.incase one parametarised constractor ni add chestey defenant ga parameatasied or defalt constractor aneydi undali. beacuse once constracot aneydi create cheyadam start chestey java aneydi constractor aneydi constractor ni create cheyadam manestundi . without constractor anydi java lo object create avadu .
//
//constracot ni memory alocate cheyadaniki vaadu kontam. 
//
//.like defalt value kakunda explicit ga nenu oka value ni echi edi defalt ga peei ani chpeta constracot use chesi.edi parametalized constracot lo estam.
//
//.public classname1(){
//	//ekkada intaneydi evakudadu// i=67;
//	}
//
//.
//
//.defalt constractor 
//
//keyword;

public class ConstOne {
	static int k;
	static String sr;
	public ConstOne() {
		k=2;
	}
	public static void main(String[] args) {
		ConstOne con=new ConstOne();
		System.out.println(k);
		
	}
	

}
class classname1{
	static int i,k;
	
	public static void main(String[] args) {
		classname1 obj=new classname1(10,20,"akthar");
		System.out.println(obj.i);
		System.out.println(obj.k);
	}
	public classname1(){
		 
	}
	public classname1(int a,int b,String s) {
		i=a;
		k=b;
	    String sr = s;
		
		
	}

	
}
class stringtestConstractor{
	static String stringchecking;
	static String catDeatils;
	public stringtestConstractor() {
		stringchecking="defalt akthar";
		catDeatils="cat is blur color and cost of the cat is 10000 rupess"
				;
	}
	public static void main(String[] args) {
		stringtestConstractor obj=new stringtestConstractor();
		System.out.println(obj.stringchecking);
		System.out.println(obj.catDeatils);
	}
	
}
class constractorprac3{
	int i;
	public constractorprac3() {
		// TODO Auto-generated constructor stub
		i=9;
		i=10;
		i=12;
	
	}
	public static void main(String[] args) {
		constractorprac3 obj=new constractorprac3()	;
	    int a=obj.i;
		System.out.println(a);
	}
} 
class constractor4{
	static String s;
	static int i;
	public constractor4() {
		// TODO Auto-generated constructor stub
		s="defalt name is Akthar";
		i=10;
		
	}
	public static void main(String[] args) {
		constractor4 obj=new constractor4();
		System.out.println(obj.i);
	}
}





class classnameone{
	 public static int a,b,c,d;
	static String s1,s2;
	public classnameone() {
		a=9;
		s1="s1 this";
	}
	public classnameone(int a1,int a2) {
		 d=a1+a2;
		
	}
	public static void main(String[] args) {
		classnameone obj = new classnameone(7,4);
		
	}
}
class classname2{
	int a;
	public classname2(int b) {
		a=b;
	}
	public static void main(String[] args) {
		classname2 obj = new classname2(14);
		System.out.println(obj.a);
	}
}
class classname3{
	int a;
	public classname3(int b) {
    a=b;
	}
	public static void main(String[] args) {
		classname3 obj = new classname3(8);
		System.out.println(obj.a);
		int a=19;
		System.out.println(a);
	}
}
class constractor5{
	int i;
	public constractor5(int a) {
		i=a;
	}
	public static void main(String[] args) {
		constractor5 obj=new constractor5(5);
		System.out.println(obj.i);
		int a=10;
		int b=a+obj.i;
		System.out.println(b);
	}
}
class constractor61{
	constractor61(){
		System.out.println();
	}
	int i=77;
	String s="this is super class";
	public void constractor6() {
		System.out.println("constractor 6");
	}
}
class constraactor7 extends constractor61{
	int i=9;
	void m1() {
		System.out.println(super.i+" "+super.s);
		int i=8;
		System.out.println(i);
		System.out.println(this.i);
	}
	public static void main(String[] args) {
		constraactor7 obj = new constraactor7();
		obj.m1();
		
	}
}
class constractor8{
	public constractor8() {
 		System.out.println("this is constractor 8");
	}
	public constractor8(int a) {
		System.out.println("this is constractor 8 parametor");
    }
	public constractor8(int a,int b) {
		this();
		System.out.println("this is constractor 8 and 2 parametor");
	}
	
}
class constractor9 extends constractor8{
	public constractor9() {
		super(8,8);
        System.out.println("9th constractor");
	}
	public static void main(String[] args) {
		constractor9 obj = new constractor9();
		
	}
	
}
class constractor10{
	public constractor10() {
		System.out.println("this is 10");
	}
}
class constractor11 extends constractor10 {
	public constractor11() {
		System.out.println("this is 11");
	}
}
class constractor12 extends constractor11{
	public constractor12() {
		System.out.println("this is 12");
	}
}
class constractor13 extends constractor12{
	public constractor13() {
		System.out.println("this is 13");
	}
	public static void main(String[] args) {
		constractor13 obj = new constractor13()	;
		System.out.println("main method starts here");
	}
}
class constractor14 {
	public constractor14() {
		System.out.println("this is constractor 14");
	}
	public constractor14(int a) {
		System.out.println("this is single parametorised constractor");
	}
}
class constractor15 extends constractor14{
	public static void main(String[] args) {
		
	}
}
class constractor16 {
	
	constractor16 (){
		System.out.println("this is 16 constractor");
	}
}
class constractor17 extends constractor16{
	constractor17 (int a){
		System.out.println("this is 17th constractor");
	}
	constractor17 (){
		System.out.println("this is 17th constractor default ");
	}
	public static void main(String[] args) {
		constractor17 obj = new constractor17();
	}
}
