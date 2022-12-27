package methods;

public class Method2 {
	
	public static void main(String[] args) {
		Method2 m2=new Method2();
		m2.m1();
		m2.m2();
	}

	public void m1()
	{
		int a=20;
		int b=10;
		int div =a/b;
		System.out.println(div);
	}
	
	public void m2()
	{
		int g=20;
		int h=30;
		int sub=g-h;
		System.out.println(sub);
	}
}
