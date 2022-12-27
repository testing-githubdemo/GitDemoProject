package String;

public class RevString1 {

	public static void main(String[] args) {
		String s1="Selenium";
		System.out.println(s1.length());
		String s2="";
		for(int i=8-1;i>=0;i--)
		{
			s2=s2+s1.charAt(i);
			
		}
		System.out.println(s2);

	}

}
