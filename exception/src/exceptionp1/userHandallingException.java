package exceptionp1;

public class userHandallingException  {

	public static void main(String[] args) {
		System.out.println("main method starts");
		try {
			System.out.println(9/0);
			throw new  userHandallingExceptionParentClass();
			
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			
		}
		System.out.println("main method ends");

	}

}
