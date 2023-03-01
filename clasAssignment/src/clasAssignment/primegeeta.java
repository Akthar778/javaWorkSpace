package clasAssignment;

public class primegeeta {
	public static void main(String[] args)
	{
		int n=100,count=0;
		for (int i=1;i<=n;i++)
		{
			if (n%i==0)
			{
				count++;
			}
		}
			if (count==2)
			{
				System.out.println("the num prim");
			}
			else
			{
				System.out.println("the num is not prime");
			}
	}
}

}
