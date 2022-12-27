package AccessSpecifier;

public class Private_Access {
	private int p1=20;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Private_Access p0=new Private_Access();
		p0.m1();
		System.out.println(p0.p1);
	}
	private void m1()
	{
		System.out.println(p1);
	}

}
