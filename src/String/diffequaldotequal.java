package String;

public class diffequaldotequal {

	public static void main(String[] args) {
		String s1=new String("java");
		String s2=new String("java");
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
        System.out.println();
		String s3=new String ("java");
		String s4="java";
		System.out.println(s3==s4);
		System.out.println(s3.equals(s4));
		System.out.println();
		String s5="java";
		String s6="java";
		System.out.println(s5==s6);
	}

}
