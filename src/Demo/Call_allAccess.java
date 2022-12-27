package Demo;
import AccessSpecifier.*;
import loops.*;
//import demo_mock1.public_diffcls;


public class Call_allAccess extends Protected_Access {
	public static void main(String[] args) {
		//public_diffcls p1=new public_diffcls();
		Public_Access p1=new Public_Access();
		p1.m1();
		System.out.println();
		System.out.println(p1.a);
		System.out.println(p1.f);
		
		public_diffcls p2=new public_diffcls();
		
		System.out.println(p2.a);
		System.out.println();
		do_while_loop d =new do_while_loop();
		System.out.println(d.j);
		System.out.println();
		Default_Access d1=new Default_Access();
		d1.m1();
		
		///Protected_Access p=new Protected_Access();//when u use a protected access specifer then u create a object of present cls
		System.out.println();
		Call_allAccess a=new Call_allAccess();
		System.out.println(a.i);
		System.out.println(a.name);
	}
	

}
