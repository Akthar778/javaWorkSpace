package first_java_project_name_here;

import java.awt.desktop.ScreenSleepEvent;

public class methods {
    public static void greet(){
	System.out.println("hello how are you welcome to this bank");
    }
    public static void name() {
    	System.out.println("mr.jhon");
    }
public static void main(String[] args) {
		greet();
		name();
	}
}
class parametor_test{
	
	public static void total_amount(String in_parametor_amount) {
		
		System.out.println(in_parametor_amount);
	}
	public static void main(String[] args) {
	    total_amount("akthar");
	}
}
class parametor_test2{
	void method_name_empId(String nameOfTheEmploye,int salry) {
		System.out.println(nameOfTheEmploye);
		System.out.println(salry);
	}
    public static void main(String[] args) {
	    parametor_test2 new_name_for_method_2=new parametor_test2();
	    new_name_for_method_2.method_name_empId("akthar",8);
	    
	
}
}
class parametor_test3{
	void method_name(String name){
		System.out.println(name);
	}
	public static void main(String[] args) {
		parametor_test3 new_class_name=new parametor_test3();
		new_class_name.method_name("akthar");
		new_class_name.method_name("niyaz");
		new_class_name.method_name("this is my full name");
	}
}

class par_3{
	static void metho_with_parametor (String name,int num) {
		
		System.out.println(name);
		System.out.println(num);
	}
	void method_nonstatic(String namee) {
		System.out.println(namee);
	}
	public static void main(String[] args) {
		metho_with_parametor("akthar",10);
		par_3 newvar=new par_3();
		newvar.method_nonstatic("this is method");
		newvar.method_nonstatic("this is method test 2");
		
	}
}

class banking {
	//welcome note , check balance,add balance,withdraw, send of to client//
	static int balance =10000;
	static void welcome() {
		System.out.println("hello sir welcome to bank");
	}
	static void check_bal() {
		System.out.println(balance);
	}
	static void addBal(int paisal) {
        balance = paisal+balance;
        System.out.println(balance);
	}
	static void withDraw(int pasial) {
		balance=pasial+balance;
		System.out.println(balance);
	}
	static void bye () {
		System.out.println("good bye sir happy to see you here");
		System.out.println("small programe sucess...");
	}
	 
	
	public static void main(String[] args) {
		welcome();
		check_bal();
		addBal(10);
		withDraw(10);
		bye();
		
	}
}


class banking_with_object{
	//requirements welcome, check balance, add balance,with draw
	String name ="akthar";
	int bal=100;
	void welcome(){
		System.out.println("hello "+name+" sir welcome to out bank sir");
		
	}
	void bal () {
		System.out.println(bal);
		
	}
	void addBal(int addingBal) {
		bal=addingBal+bal;
		int addingBalance=addingBal;
		System.out.println("adding balance "+addingBalance);
		System.out.println("total "+bal);
	}
	void withdraw (int addingBal) {
		int bal= bal -addingBal;
	}
	int raminingAfterWithdraw() {
		return bal;
	}
	void totalBal() {
		System.out.println("after adding and removing "+bal);
	}
	void bye() {
		System.out.println("bye sir have a great day ");
	}
	public static void main(String[] args) {
		banking_with_object newvar = new banking_with_object();
		newvar.welcome(); newvar.bal(); newvar.addBal(100); 
		newvar.withdraw(110);
		
		
		
		
		
	}
}
class imclear{
	int amountt=100;
	public static void withdr(int amount) {
		int amountt=amount+amount;
		System.out.println(amountt);		
	}
}





































