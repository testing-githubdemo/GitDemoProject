package loops;

public class global_variable1 {
static int rno=1;
static String nm="Ritesh";
	public static void main(String[] args) {
		m1();
		global_variable1 gv=new global_variable1();
		gv.m2();
		
		System.out.println(rno);
		

	}
	public static void m1()
	{
		System.out.println(rno);
		
		System.out.println(nm);
	}
	public void m2()
	{
		System.out.println(rno);
		System.out.println(nm);
	}
}
