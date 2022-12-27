package String2;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class StringMethod {

	public static void main(String[] args) {
		//1.charAt()-It returns char value for the perticular index.
		String s1="TechMax";
		System.out.println(s1.length());
		System.out.println(s1.charAt(2));
		System.out.println(s1.charAt(5));
		
		//2.length()-Display string size.
		
		System.out.println(s1.length());
		
		//3.equals()-output display in boolean(true/false).It check content of string in given object.
		
		String s2="TechMax";
		String s3="TechMax";
		System.out.println(s2.equals(s3));
		
		//4.isEmpty()-To check wheather a string is empty or not.
		
		String s4="hello";
		System.out.println(s4.isEmpty());
		String s5="";
		System.out.println(s5.isEmpty());
		
		//5.replace-We can replace the character of specefic string.
		
		String s6="Hello";
		System.out.println(s6);
		System.out.println(s6.replace('e', 'y'));
		
		//5.replaceAll-We can replace the word of specefic string.
		
		String s7="Hello java";
		System.out.println(s7);
		System.out.println(s7.replaceAll("java", "python"));
		System.out.println(s7.replaceAll("Hello", "Hiii"));
		
		//6.subString()-It returns substing for given string.
		//When we use subString then starting index including but ending index is excluding.
		
		String s8="Hello TechMax";
		System.out.println(s8);
		System.out.println(s8.substring(2));
		System.out.println(s8.substring(1, 11));
		System.out.println(s8.substring(2, 9));
        System.out.println(s8.substring(1, 9));
		
		//7.toLowercase()-If string is capital when we use tolowercase()it converts small letters .
		String s9="JAVA CLASSES";
		System.out.println(s9.toLowerCase());
		
		//8.toUpperCase-If string is lower case when we use toUppercase()it converts Capital letters .
		
		String s10="java hello";
		System.out.println(s10.toUpperCase());
		
		
		//9.trim()-white spaces are removed from string(starting and ending white space remove)
		String s11=" Classes Java ";
		System.out.println(s11);
		System.out.println(s11.trim());
		
		//10.indexof()-Display index of character in string those we are want.
		
		String s12="Pyathon Classees";
		System.out.println(s12.indexOf('y'));
		System.out.println(s12.indexOf('s'));
		System.out.println(s12.indexOf('s',s12.indexOf('s')+1));
	    System.out.println(s12.indexOf('s',s12.indexOf('s',s12.indexOf('s')+1)+1));	
	    System.out.println(s12.indexOf('a'));
	    System.out.println(s12.indexOf('a',s12.indexOf('a')+1));
	    
	    //11.lastIndexOf()-Display index of last character in string
	    
	    String s13="java";
	    System.out.println(s13.lastIndexOf('a'));
	    
	    //12.split()-To seperate the string between words.
	    //java/classes/techmax
	    //java
	    //classes
	    //techmax
	    String s14="java/classes/TechMax";
	    System.out.println(s14);
	  //  System.out.println(s14.split("/"));
	    
	    String s15[]=s14.split("/");
	    for(int i=0;i<s15.length;i++)
	    {
	    	System.out.println(s15[i]);
	    }
	    
	   //2 example
	    
	    String s16="10-"
	    		+ "02-"
	    		+ "2022";
	    String s17[]=s16.split("-");
	    for(int i=0;i<s17.length;i++)
	    {
	    	System.out.println(s17[i]);
	    }
	    
	    //3.Example
	    
	    String s18="Tech Max";
	    String []s19=s18.split(" ");
	    for(int i=0;i<s19.length;i++)
	    {
	    	System.out.println(s19[i]);
	    }
	    
	    System.out.println();
	    //13.concat()-It Concatenates the specified string.
	    String s20="Hello Classes ";
	    String s21="Hiii";
	    System.out.println(s20);
	    System.out.println(s21);
	    System.out.println(s20.concat("Techmax Hii "));
	    System.out.println(s20.concat("python"));
	    
	    
	    
	    		
	    
		
		
		

	}

}
