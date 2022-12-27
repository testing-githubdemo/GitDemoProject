package Final_finally;

public class Finally {

	public static void main(String[] args) {
		div();
		
	}
	public static void div()
	{
		try {
		int i=10;
		//System.out.println("Div Method");
		int k=i/0;
		System.out.println(k);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Divided by zero");
		}
		finally {
			System.out.println("Executed this code even after any execution");
		}
		
		
	}
	

}
