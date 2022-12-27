package StringDemo;

public class reverse {

	public static void main(String[] args) {
	String s1="Poonam";
	int len=s1.length();
	String s2="";
	for(int i=len-1;i>=0;i--)
	{
		s2=s2+s1.charAt(i);
		
	}
	System.out.println(s2);

	}

}
