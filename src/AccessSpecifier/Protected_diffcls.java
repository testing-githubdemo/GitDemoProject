package AccessSpecifier;


public class Protected_diffcls {
	protected  int pp=30; 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Protected_diffcls pd=new Protected_diffcls();
		pd.m1();
		System.out.println(pd.pp);
		Protected_Access pd1= new Protected_Access();
		pd1.m1();
		System.out.println(pd1.i);
		System.out.println(pd1.name);

	}
	protected void m1()//method declaration
	{
		System.out.println(pp); // defination
	}

}
