package variables;

public class constructor1 {
String nm;
float a=20.99f;
boolean s=true;
static String nm1="Poonam";
//public constructor1() {
	//System.out.println("Default constructor ");
//}
	public static void main(String[] args) {
		System.out.println(nm1);
		constructor1 c=new constructor1();
		System.out.println(c.nm);
		System.out.println(c.a);
		System.out.println(c.s);

	}
	

}
