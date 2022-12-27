package loops;

public class global_variable2 {
static int i=50;
	public static void main(String[] args) {
		global_variable2 gv1=new global_variable2();
		gv1.m1();
		gv1.m2();
		gv1.m3();
		m4();
	}
	public void m1()
	{
		System.out.println(i);
	}
	public void m2()
	
	{
		int i=30;
		System.out.println(i);
	}
	public void m3()
	{
		System.out.println(i);
	}
	public static void m4()
	{int i=70;
		System.out.println(i);
	}

}
