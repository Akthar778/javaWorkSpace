class r 
{
	public static void main(String[] args) 
		
	{
		System.out.println("akthar");
		int n=6,count = 0;
		for (int i = 1; i <=n; i++) {
			if(n%i==0) {
				count++;
				
			}
			
		}
		if(count==2) 
			System.out.println("its a prime number");
		else 
			System.out.println("its not a ptime number");
		
		
		
	}
}
class l
{
	public static void main(String[] args)
	{
	//prime number checking
    int n=6;
	int count=0;
	          //1  6
	for(int i=1;i<=n;i++){
		if(n%i==0)  {
			count++;
		}
		if(count==2)
			System.out.println("its a prime");
			else
			System.out.println("not prime");
	
	}

	}


}