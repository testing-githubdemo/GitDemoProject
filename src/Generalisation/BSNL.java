package Generalisation;

public class BSNL implements Simcard  {

	public static void main(String[] args) {
		BSNL  b1=new BSNL();
		b1.SMS();
		b1.audiocall();
		b1.videocall();
		b1.netflix();
		
		JioCard j=new JioCard();
		j.amazonprime();
		j.audiocall();
		
	}

	@Override
	public void SMS() {
	System.out.println("BSNL --SMS");			
	}

	@Override
	public void audiocall() {
		System.out.println("BSNL--audiocall");		
	}

	@Override
	public void videocall() {
		System.out.println("BSNL--videocall");		
	}
	public void netflix()
	{
		System.out.println("Netflx");
	}

}
