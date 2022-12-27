package Interface;

public class implementationcls implements Interface2,Interface {

	public static void main(String[] args) {
		implementationcls im=new implementationcls();
		im.m1();
		im.m2();
		im.m3();
		im.m4();
		im.m5();
	}
	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("M1");
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		System.out.println("M2");
	}

	@Override
	public void m3() {
		// TODO Auto-generated method stub
		System.out.println("M3");
	}

	@Override
	public void m4() {
		// TODO Auto-generated method stub
		System.out.println("M4");
	}
	public void m5()
	{
		
		System.out.println("M5");
	}

	
}
