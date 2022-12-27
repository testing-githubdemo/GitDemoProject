package Demo;

public class Default_Access {
	int a=50;
	public static void main(String[] args) {
		Default_Access d1=new Default_Access();
		d1.m1();
		d1.m2();
		System.out.println(d1.a);
		
	}
	void m1()
	{
		
		System.out.println("Hello");
	}
	void m2()
	{
		System.out.println("Hiii");
	}

}
