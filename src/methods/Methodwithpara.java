package methods;

public class Methodwithpara {

	public static void main(String[] args) {
		add();
		Methodwithpara m1=new Methodwithpara();
		m1.sub(20, 10);
	}
	public static void add()
	{
		int w=20;
		int t=30;
		int sum=w+t;
		System.out.println(sum);
	}
	public void sub(int a, int b)
	{
		int s=a-b;
		System.out.println(s);
	}
	
	

}
