package AccessSpecifier;

public class Protected_Access {
	
	protected int i=20;
	protected  String name="Patil" ;
		
	

	public static void main(String[] args) {
	Protected_Access p=new Protected_Access();
	p.m1();
	System.out.println("i Value is"+" "+p.i);

	}
	protected void m1() {
		int i=39;
		System.out.println(i);
		System.out.println(this.i);
		System.out.println(name);
	}

}
