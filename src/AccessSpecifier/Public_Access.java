package AccessSpecifier;



public class Public_Access {
	public int a=20;
	public float f=20.8f;
	public static void main(String[] args) {
		Public_Access p1= new Public_Access();
		
		p1.m1();
		
		
	}
	public void m1()
	{
		System.out.println(a);
		
		System.out.println(f);
	}

}
