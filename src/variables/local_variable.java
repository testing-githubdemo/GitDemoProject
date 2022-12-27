package variables;

public class local_variable {
	public static void main(String[] args) {
		
		
		int a=20;
		System.out.println(a);
		m1();
		//System.out.println(i);
		local_variable lv=new local_variable();
		lv.m2();
 // System.out.println(j);
	}
	public static void m1()
	{
		int i=10;//local variable
		System.out.println(i);
		//System.out.println(a);
	}
	public void m2()
	
	{
		int j=19;
		System.out.println(j);
	}

}
