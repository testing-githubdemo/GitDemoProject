package polymorphism;

public class childstatic extends Static{

	public static void main(String[] args) {
		childstatic cs=new childstatic();
		m1();
		cs.m2();
		
		System.out.println();
		Static sc=new childstatic();
		sc.m1();//method hiding
		sc.m2();

	}
	public static void m1()//declaration
	{
		System.out.println("child Method 1");//defination
		
	}
	public void m2()
	{
		System.out.println("Chlid Method 2");
	}

}
