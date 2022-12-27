package Array;


import java.util.Arrays;

public class Intdatatype {
	public static void main(String[] args) {
		int a[]=new int[5];
		System.out.println(a.length);
		a[0]=20;
		a[1]=40;
		a[2]=30;
		a[3]=80;
		a[4]=60;
		//a[5]=75;;
		Arrays.sort(a);
		System.out.print(a[0]+" "+a[1]+" "+a[2]+" "+a[3]+" "+a[4]);
	System.out.println();
	
	}

}
