package Array;

import java.util.Arrays;

public class Reverse_array {

	public static void main(String[] args) {
		int a[]= {2,7,4,5,9,0,3,6};
		System.out.println("Length="+a.length);
		Arrays.sort(a);
		//System.out.println(a);
		for(int j=0;j<a.length;j++)
		{
			System.out.print(a[j]+" ");
		}
			
		System.out.println();
		Arrays.sort(a);
		for(int i=7;i>=0;i--)
		{
			System.out.print(a[i] +" ");
		}
		
		
	}

}
