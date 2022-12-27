package variables;

public class global_variable {
	static int a=20;//global var
	static String nm="abc";

	public static void main(String[] args) {
		System.out.println(a);
		System.out.println(nm);
		m1();
		global_variable gl=new global_variable();
		gl.m2();
		gl.m3();
		gl.m4();
		

	}
	
	public static void m1()
	{
		int a=30;
	
		System.out.println(a);
		System.out.println(nm);
	}
	public void m2()
	{
		System.out.println(a);
		System.out.println(nm);
	}
	public void m3()
	{
		 a=50;
		System.out.println(a);
		System.out.println(nm);
	}
	public void m4()
	{
		System.out.println(a);
		System.out.println(nm);
	}

}
