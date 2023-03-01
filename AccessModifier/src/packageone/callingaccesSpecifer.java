package packageone;

public class callingaccesSpecifer {
	private String pri="private string";
	protected String s =" protected string";
    int a=8;
    public static int b=8;
	public static void main(String[] args) {
		System.out.println(new callingaccesSpecifer ().a);
        System.out.println(b);
        System.out.println(new callingaccesSpecifer().pri);
	}
 void method() {
		System.out.println(this.a);
		System.out.println(b);
		System.out.println(new callingaccesSpecifer().pri);
	}

}
