package String2;

public class String1 {

	public static void main(String[] args) {
		String s1=new String("java");
		//System.out.println(s1);
		 String s2= new String("java");
		 System.out.println(s1==s2);
		 
		 System.out.println(s1.equals(s2));
		 
		 String s3="java";
		 String s4="java";
		 System.out.println(s3==s4);
		 
		 String s5="python";
		 System.out.println(s3.equals(s5));
		 String s6="Java";
		 
		 System.out.println(s4.equals(s6));
		 
		 System.out.println(s1.equals(s3));
		 
		 System.out.println(s1==s3);
	}

}
