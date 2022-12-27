package Variables_practice;

//import variables.local_variable;

public class Local_variable {

	public static void main(String[] args) {
		m1();
		Local_variable lv1=new Local_variable();
		lv1.m2();
	
	}
	public static void m1()
	{
		int a=40;
		int b=20;
		int c=a/b;
		System.out.println(c);
		
	}
	public void m2()
	{
		String nm="abcc";
		
		System.out.println(nm);
		//System.out.println();
	}

}
