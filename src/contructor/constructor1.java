package contructor;

public class constructor1 {
	int a=20;
	static int b=30;
	public constructor1() {
		//a=20;
		//super();
		// TODO Auto-generated constructor stub
	}
	
	

	public static void main(String[] args) {
		constructor1 c=new constructor1();
		
		c.test();
		

	}
	public  void test()
	{
		System.out.println(this.a);
		System.out.println(b);
		System.out.println("Running Method");
	}

}
