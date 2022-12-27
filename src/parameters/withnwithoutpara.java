package parameters;

public class withnwithoutpara {
	public static void main(String[] args) {
		
		add();
		sub(50.5f,30,3.5);
		
	}
	public static void add()
	{
		int a=10;
		int b=20;
		int sum=a+b;
		System.out.println("Addition is:"+" "+sum);
	}
	public static void sub(float a,int b,double d)
	{
		double c=a-b+d;
		System.out.println("Substraction is:"+c);
		
		
	}

}
