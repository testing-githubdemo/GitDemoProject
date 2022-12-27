package polymorphism;

public class methodoverriding extends methodoverloading{

	public static void main(String[] args) {
		
		methodoverriding mo=new methodoverriding();
		mo.add();
		mo.add(20, 30.4f);
		add(20, 80.6);//method hiding
		mo.add1(50, 30.6);
		
		methodoverloading m1=new methodoverriding();
		add(2, 30.4);//method hiding
		m1.add();
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
		System.out.println("Addition int n float:"+add);
	}
	public static void add(int a,double d)
	{
		double add=a+d;
		System.out.println("Addition is"+add);
	}
	public void add1(int a, double d)
	{
		double add=a+d;
		System.out.println("Addition int n double"+add);
	}
	

}
