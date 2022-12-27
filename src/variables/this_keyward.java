package variables;

public class this_keyward {
	//this keyword
static String nm="Raj";
int s=59;

	public static void main(String[] args) {
	   int a=20;
	   System.out.println(a);
		this_keyward th=new this_keyward();
      th.m4();
      System.out.println(th.s);
      m6();
      
	}
	public void m4()
	{
		String n="poonam";
		System.out.println(n);
		System.out.println(this.s);
		//this_keyward  th1=new this_keyward();
		//System.out.println(th1.nm);
		System.out.println(nm);
	}
	public static void m6()
	{
		this_keyward th1=new this_keyward();
	System.out.println(th1.s);
		//System.out.println(this.s);
		System.out.println(nm);
	}

}
