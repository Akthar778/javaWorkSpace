class p
{
	public static void main(String[]args){
	int n=1911,rem=0; int tem=n,sum=0,div=0;

	while (n>0)
	{
		rem=n%10;
		sum=(sum*10)+rem;
		n=n/10;


	}
	if(sum== tem){
		System.out.println("palindrom");
	}else{
		System.out.println("not palindrom");
	}
	
	}
}