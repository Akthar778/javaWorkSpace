
public class raf {	
	static {
		System.out.println("this first static block");
	}
	{
		System.out.println("this is first non static block");
		{
			System.out.println("this 2nd inside static block");
			{
				System.out.println("this is 3rd non static block");
			}	
		}
	}
	static {
		System.out.println("second static block");
	}
	static {
		System.out.println("this is thord static block");
	}
	public static void main(String[] args) {	
			
	}

}
