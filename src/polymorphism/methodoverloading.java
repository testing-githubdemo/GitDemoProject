package polymorphism;

public class methodoverloading {
int a=50;
int b=20;
float f1;
double d;
	public static void main(String[] args) {

		methodoverloading m1=new methodoverloading();
		m1.add();
		m1.add(10, 10.5f);
		add(30, 30.5);
	}
	public void add()
	{
		int add=a+b;
		System.out.println(add);
	}
	public void add(int a, float f)
	{
		a=this.a;
	     f1=f;
		float add=a+f1;
		System.out.println(add);
	}
	public static void add(int a, double d)
	{
		double add=a+d;
		System.out.println(add);
	}

}
