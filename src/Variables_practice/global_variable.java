package Variables_practice;

public class global_variable {
static int a=20;
String nm="PQR";
	public static void main(String[] args) {

		System.out.println(a);
		//System.out.println(nm);
		global_variable gv1=new global_variable();
		System.out.println(a);
		System.out.println(gv1.nm);
		//gv1.nm;
		method1();
		gv1.method2();
	}
	public static void method1()
	{
		System.out.println(a);
        global_variable gv=new global_variable();
        
		System.out.println(gv.nm);
	}
	public void method2()
	{
		System.out.println(a);
		System.out.println(nm);
	}
	

}
