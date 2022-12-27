package Array;



public class Objecttype {
	public static void main(String[] args) {
//		Object a1[]=new Object[7];
//		a1[0]=20;
//		a1[1]="Hello";
//		a1[2]=true;
//		a1[3]='A';
//		a1[4]=20.4f;
//		a1[6]=20.9;
		
		Object a1[]= {2,"Hello",80.8f,'A',6.5};
		
		System.out.println(a1.length);
		System.out.println();
		for(int i=0;i<a1.length;i++)
		{
			System.out.println(a1[i]);
		}
		
	}

}
