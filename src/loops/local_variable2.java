package loops;

public class local_variable2 {

	public static void main(String[] args) {
 int a=10;
 String b="abc"; 
  System.out.println(a);
  System.out.println(b);
  m1();
  local_variable2 LV = new local_variable2();
  LV.m2();
  
  //m2();
  
       
	}
	public static void m1()
	{
		//m1();
		//local_variable2.m1();
		int a=1;
		int b=7;
		System.out.println(a+b);
		local_variable2 lv=new local_variable2();
		lv.m2();
	}
	public void m2()
	{
		int x=20;
		int y=40;
		String nm="abc";
		int c=x+y;
		System.out.println(x+" "+y+" "+" "+nm+" "+c );
				
	}

}
