package variables;

public class non_staticcall {
	int a=30;
	String s="Datta";

	public static void main(String[] args) {
    non_staticcall ns=new non_staticcall();
    System.out.println(ns.a);
    System.out.println(ns.s);
    m3();
    
    //non static variable call from diff class
    naostatic_varible nv=new naostatic_varible();
    nv.m1();
    System.out.println(nv.nm);
	}
	public static void m3()
	{
		
		non_staticcall ns1= new non_staticcall();
		System.out.println(ns1.a);
		System.out.println(ns1.s);
		
	}

}
