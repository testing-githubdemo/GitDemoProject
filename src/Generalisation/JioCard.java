package Generalisation;

public class JioCard implements Simcard {

	public static void main(String[] args) {
		JioCard j1=new JioCard();
		j1.SMS();
		j1.audiocall();
		j1.videocall();
		j1.amazonprime();

	}

	@Override
	public void SMS() {
		System.out.println("Jio--SMS");
		
	}

	@Override
	public void audiocall() {
		System.out.println("Jio--audiocall");
			}

	@Override
	public void videocall() {
		System.out.println("jio--videocall");
				
	}
	
	public void amazonprime()
	{
		System.out.println("Jio--Prime");
	}

}
