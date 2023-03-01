package first_java_project_name_here;

public class vaiables_one {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int a;
	a=9;
	int b=2;
	System.out.println(a+b+"this a and b");
		
	}

}
class var_2{
	int i=1;
	public static void main(String[] args) {
		var_2 newname=new var_2();
		System.out.println(newname.i);
	}
}
class var_3{
	int i=2;
	public static void main(String[] args) {
		var_3 new_name = new var_3();
System.out.println(new_name.i);
	}
}
class var4{
	int i=300;
	public static void main(String[] args) {
		var4 new_variable_name=new var4();
		//System.out.println(new_variable_name.i);
		System.out.println(new var4().i);
	}
}
class var5{
	static String text="in global";
	public static void main(String[] args) {
		System.out.println(text);
	}
}
class var6{
int i=1;
public static void main(String[] args) {
	//System.out.println(new var6().i);
	var6 new_name_of_variable=new var6();
	System.out.println(new_name_of_variable.i);
} 
}
class var7{
String a="this is string test";
static int b=1;
public static void main(String[] args) {
	System.out.println(new var7().a);
	System.out.println(b);
}
}
class clas8{
	static int i=1;
    int n=2;
    public static void main(String[] args) {
		System.out.println(i);
		System.out.println(new clas8().n);
		System.out.println(i);
	}
    public static void main1(String[] args) {
		System.out.println(i);
    }

}
class class9{
	String with_object="with object";
	//with object
	static String a ="akthar";
	//its global veriable//
	public static void main(String[] args) {
		System.out.println(a);
		System.out.println(new class9().with_object);
		
	}
	public static void main2(String[] args) {
		System.out.println(a);
	}
}
class class_name10{
String without_static_filed="without static filed";
static String With_string="with static filed";
public static void main(String[] args) {
	class_name10 new_variable = new class_name10();
	System.out.println(new_variable.without_static_filed);
	
	System.out.println(new class_name10().without_static_filed);
	System.out.println(With_string);
}
}
class class_name11{
	int i=1;
	static int n=1;
	public static void main(String[] args) {
		System.out.println(n);
		System.out.println(new class_name11().i);
	}
	
}
class class_name12{
	String a ="this is without static";
    static String b="with static";
    public static void main(String[] args) {
		System.out.println(b);
		System.out.println(new class_name12().a);
		class_name12 variable_name=new class_name12();
		System.out.println(variable_name.a);
	}
}
class class_name13{
	int i=1;
	public static void main(String[] args) {
		class_name13 variable_name= new class_name13();
        System.out.println(variable_name.i);	
	}
}
class class14{
	int i=10;
	public static void main(String[] args) {
		class14 new_variable_name=new class14();
		System.out.println(new_variable_name.i);
		System.out.println(new class14().i);
	}
}

class class_name15{
	static int i=0;
	public static void main(String[] args) {
		System.out.println(i);
		System.out.println(new class_name15().n);
	}
	int n=1;
}



class class_name17 {
	static int i=0;
	public static void main(String[] args) {
		System.out.println(i);
		
	}
}
class class_name18{
	int i=1;
	public static void main(String[] args) {
		System.out.println(new class_name18().i);
	}
	
}
class class_name19{
	public static void main(String[] args) {
		int a=10;
		int b=10;
		int c=a+b;
		System.out.println(c);
	}
}
class class_name20{
	static int i=1;
	int num =10;
	public static void main(String[] args) {
		System.out.println(i);
		class_name20 new_variable_name=new class_name20();
		System.out.println(new_variable_name.num);
		System.out.println(new class_name20().num);
	}
}
class class_name21{
	static int i=1; 
	int n=10;
	String name="akthar";
	 String var1="here all the info save";
	public static void main(String[] args) {
		System.out.println(i);
		System.out.println(new class_name21().n);
		class_name21 new_var=new class_name21();
		System.out.println(new_var.n);
		System.out.println(new class_name21().name);
		System.out.println(new class_name21().var1);
	}
}

//local variables
class class_name22{
	public static void main(String[] args) {
		int i=1;
		System.out.println(i);
	}
}


































































