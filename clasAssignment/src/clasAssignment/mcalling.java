class mcalling 

{   int a=19;
    static int b=99;
	public static void mname(){
		System.out.println("this is method 1");
		mname2();
		System.out.println();

	}
	public static void mname2(){
        System.out.println("this is method 2");	
		
	}
	public static void main(String[] args) 
	{
		mname();
	}
}
