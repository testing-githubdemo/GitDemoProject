package Final_finally;

public final class final_keyward {//final class

	public static void main(String[] args) {
		int i=100;
		System.out.println(i);
		i=300;
		System.out.println(i);
		final int j=20;// can not change value
		//System.out.println(j);
		//j=200;// wrong
		System.out.println(j);
		final_keyward f1=new final_keyward();
	f1.m1();
		m2();
		
		
	}
	public final void m1()//final method
	{
		System.out.println("Hiii");
	}

	public static final void m2()//final method
	{
		System.out.println("Hello");
	}

}
