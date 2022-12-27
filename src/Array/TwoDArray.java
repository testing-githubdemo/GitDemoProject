package Array;

public class TwoDArray {

	public static void main(String[] args) {

int a[][]=new int[3][3];
a[0][0]=20;
a[0][1]=30;
a[0][2]=40;
a[1][0]=40;
a[1][1]=23;
a[1][2]=43;
a[2][0]=25;
a[2][1]=43;
a[2][2]=32;
for (int r=0;r<a.length;r++)
{
	System.out.println();
	for(int c=0;c<a[0].length;c++)
	{
	
		System.out.print(a[r][c]+" ");
		
	}
}
		

	}

}
