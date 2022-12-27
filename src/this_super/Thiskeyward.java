package this_super;

public class Thiskeyward extends this1{
	int a=20;
	float b=40.70f;
	public static void main(String[] args) {
		Thiskeyward t=new Thiskeyward();
		
		t.this1();
		
		System.out.println(t.a);
		System.out.println(t.b);
		//this1 t= new this1();
		
		
	}
	
	public void this1()
	{
		int a=30;
		System.out.println(a);
		System.out.println(this.a);//non static global variable call frm same cls when local variable same and global variable name is same
		//System.out.println(this.a);
		System.out.println(super.a);//non static global variable call from diff cls by using extends keyword
		
	}

}
