class  Lcmdowhile
{
	public static void main(String[] args) 
	{
		int a=10,b=20,lcm=0;
		lcm=(a>b)?a:b;
		while(true){
		if(lcm%a==0 && lcm%b==0){
		System.out.println("the lcm of a and b is "+lcm);
		break;

		}
		lcm++;
		}
	}
}
