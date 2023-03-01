class a extends Exception
{
	a()	{
		System.out.println("this is user handalling exception");
	}
	a(String b){
		super (s);
	}
}
class b
{
	public static void main(String[] args) 
	{
		int a=17;
		try{
			if(a<18){
				throw new a();
			}

		}catch(a b){
			System.out.println("not eligible for vote");
		}
	}
}
