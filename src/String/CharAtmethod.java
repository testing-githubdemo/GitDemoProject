package String;

public class CharAtmethod {

	public static void main(String[] args) {

String s1="Velocity Classes";
System.out.println(s1.length());
System.out.println(s1.charAt(8));
System.out.println(s1.charAt(15));
System.out.println(s1.charAt(0));

String s2="Velocity";
String s3="velocity";
String s4=new String("Velocity");
System.out.println(s2.equals(s3));
System.out.println(s2.equals(s4));
System.out.println();

String s5="java";
System.out.println(s5.isEmpty());

String s6="";
System.out.println(s6.isEmpty());
System.out.println();

String s7="Velocity";
System.out.println(s7.replace('e', 'E'));
String s8="Hello Java Classes";
System.out.println(s8.replaceAll("Hello", "Velocity"));
System.out.println();

String s9="Testing Classes";
System.out.println(s9.substring(2));
System.out.println(s9.substring(1, 13));
System.out.println();

String s10="Testing Vetocity";
System.out.println(s10.indexOf('s'));
System.out.println(s10.indexOf('T'));
System.out.println(s10.indexOf('t'));
System.out.println(s10.indexOf('t',s10.indexOf('t')+1));
System.out.println(s10.indexOf('t',s10.indexOf('t',s10.indexOf('t')+1)+1));
System.out.println();
System.out.println(s10.lastIndexOf('y'));
System.out.println();

String s11="velociry";
System.out.println(s11.toUpperCase());
System.out.println();
String s12="HELLO";
System.out.println(s12.toLowerCase());

System.out.println();
String s13=" Hello Java ";
System.out.println(s13.trim());
System.out.println();

String s14="Hello Java =Testing Classes";
//System.out.println(s14.split("="));//wrong
String s15[]=s14.split("=");
for(int i=0;i<s15.length;i++)
{
	System.out.println(s15[i]);
}
System.out.println();
String s16="Hello ";
System.out.println(s16.concat("Java"));
System.out.println();

String x="Hello ";
String y="java";
int a=20;
int b=30;
System.out.println(x+y);
System.out.println(x+y+a+b);//hellojava2030
System.out.println(a+b+x+y);//50hellojava
System.out.println(x+y+(a+b));//hellojava50


	}

}
