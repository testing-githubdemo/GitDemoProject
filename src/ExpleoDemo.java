
public class ExpleoDemo {
	
	protected static int var=0;
	public void Dog()
	{
		System.out.println("Dog is Silence");
		var++;
	}

	
}

public class Dog1 extends ExpleoDemo{
	protected static int var=10;
	public void dog()
	{
		System.out.println("Dog is Bark");
		var++;
	}
	public static void main(String[] args) {
		ExpleoDemo ex=new Dog1();
		ex.Dog();
		

		}
	
}




