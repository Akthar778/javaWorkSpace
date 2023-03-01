package first_java_project_name_here;

public class bankingPoject {
    static int bal=100;
    public static void welcome() {
    	System.out.println("welcome");
    	System.out.println("present balance"+bal);
    }
    public static void adding(int Adding) {
    	bal=Adding+bal;
    	
    }
    public static int  Adding() {
    	return bal;
    	
    }
    public static void afterAddingbal() {
    	System.out.println(bal);
    }
   
    
    
    public static void removing(int Withdraw) {
        bal=bal-Withdraw;
        System.out.println(bal);
    }
    public static int sored() {
    	return bal;
    }
    public static void bye(String namee) {
    	System.out.println("bye "+namee);
    }
    
	public static void main(String[] args) {
		//welcome adding checkBal removie checkBal bye
		welcome();
		adding(10);
		afterAddingbal();
		
		removing(20);
        bye("arshu");
	}

}
