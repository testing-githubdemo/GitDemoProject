package Array;

import java.util.Arrays;

public class Stringdatatype {

	public static void main(String[] args) {
		String s[]=new String[5];
		s[0]="Poonam";
		s[1]="Patil";
		s[2]="Audi";
		s[3]="Datta";
		s[4]="Mobile";
		System.out.println(s.length);//length
		Arrays.sort(s);//sort
		
		for(int i=0;i<s.length;i++)
		{
			System.out.println(s[i]);
		}
		
		 
		
	}

}
