package Interface;

public class implements1 implements add,sub {
	public static void main(String[] args) {
		
		implements1 m1=new implements1();
		m1.substraction();
		m1.addition();
				
	}

	int a=10;
	int b=25;
	@Override
	public void substraction() {
		
		int a=30;
		int b=20;
		int sub=a-b;
		System.out.println(sub);
	}

	@Override
	public void addition() {
		// TODO Auto-generated method stub
		int add=a+b;
		System.out.println(add);
	}

}
