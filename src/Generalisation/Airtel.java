package Generalisation;

public class Airtel implements Simcard{

	public static void main(String[] args) {
		Airtel a1=new Airtel();
		a1.SMS();
		a1.audiocall();
		a1.videocall();
		a1.hotstar();

	}
	public void SMS()
	{
		System.out.println("Airtel--SMS");
	}
	public void audiocall()
	{
		System.out.println("Airtel--Audiocall");
	}
	public void videocall()
	{
		System.out.println("Airtel--videocall");
	}
	public void hotstar()
	{
		System.out.println("Aritel--hotstar");
	}

}
