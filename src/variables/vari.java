package variables;

public class vari {
 static int a=20;
 static int b=30;
	public static void main(String[] args) {
       int c=a+b;
       System.out.println(c);
      // m1();
       vari.m1();
       vari v=new vari();
       v.m2();
	}
	public static void m1()
	{
		int c=a-b;
		System.out.println(c);
	}
	public void m2()
	{
		int k=a*b;
		
		System.out.println(k);
		
	}

}
