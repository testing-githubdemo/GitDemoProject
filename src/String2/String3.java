package String2;

public class String3 {

	public static void main(String[] args) {
		String x="Hello";
		String y="Books";
		int a=10;
		int b=20;
		
		System.out.println(x+y);  //HelloBooks
 		System.out.println(a+b);  //30
		System.out.println(x+y+a); //HelloBooks10
		System.out.println(x+y+a+b); //HelloBooks1020  //hello+books=helloBooks+10=helloBoks10+20=
		System.out.println(a+b+x+y); //30HelloBooks
		System.out.println((a+b)+x+y);//30HelloBooks
		System.out.println(x+y+(a+b)); //HelloBoks30

	}

}
