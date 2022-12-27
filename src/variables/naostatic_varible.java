package variables;

public class naostatic_varible {
	int a=20;
	String nm="abc";

	public static void main(String[] args) {
		//System.out.println(a);
		//System.out.println(nm);
		//non static variable call from same class
	naostatic_varible ns=new naostatic_varible();
		ns.m1();
		System.out.println(ns.a);
		System.out.println(ns.nm);
		m2();
		//naostatic_varible ns1=new naostatic_varible();
		//ns1.m2();

	}
	public void m1()
	{
		
		naostatic_varible ns1=new naostatic_varible();
		System.out.println(ns1.a);
		System.out.println(ns1.nm);
		
	//System.out.println(a);
	//	System.out.println(nm);
	}
	public static void m2()
	{
		naostatic_varible ns1=new naostatic_varible();
		
		System.out.println(ns1.a);
		System.out.println(ns1.nm);
	}

}
