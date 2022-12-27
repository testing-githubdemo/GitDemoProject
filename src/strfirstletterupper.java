
public class strfirstletterupper {

	public static void main(String[] args) {
 // System.out.println(strfirstletterupper.lettercap("my name is poonam"));
String str="my name is poonam";


	String s1[]=str.split(" ");
	String s2=" ";
	for(String w:s1)
	{
		String firstletter=w.substring(0,1);
		//System.out.println(firstletter);
		String afterfirst=w.substring(1);
		//System.out.println(afterfirst);
		s2+=firstletter.toUpperCase()+afterfirst+" ";
		
	}
	System.out.println(s2);


//public static String lettercap(String str)
//
//{
//	String s1[]=str.split(" ");
//	String s2=" ";
//	for(String w:s1)
//	{
//		String firstletter=w.substring(0,1);
//		
//		String afterfirst=w.substring(1);
//		s2+=firstletter.toUpperCase()+afterfirst+" ";
//		//System.out.println(s2);
//		
//	}
//	return s2.trim();
//}

}
}

