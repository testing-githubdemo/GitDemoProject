package this_super;

public class Super_keyward extends super_keyward1{

	double d=20.33;
	float f=55.98f;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Super_keyward k=new Super_keyward();
		k.m1();

	}
	public void m1()
	{
		
		System.out.println(d);
		System.out.println(f);
		System.out.println(a);
		System.out.println(super.d);
	}

}
