package Final_finally;

public class Finalize {

	public static void main(String[] args) {
Finalize f2=new Finalize();
f2=null;
System.gc();
	}
	
	public void finalize()
	{
		System.out.println("finalize method call");
	}

}
