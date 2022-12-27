package Array;

public class StringTwoD {
	public static void main(String[] args) {

		String a[][]=new String[3][3];
		a[0][0]="A ";
		a[0][1]="B ";
		a[0][2]="C ";
		a[1][0]="A1";
		a[1][1]="A2";
		a[1][2]="A3";
		a[2][0]="B1";
		a[2][1]="B2";
		a[2][2]="B3";
		System.out.println(a[0][2]);
		System.out.println(a[2][2]);
		for (int r=0;r<a.length;r++)//row
		{
			System.out.println();
			for(int c=0;c<a[0].length;c++)//col
			{
			
				System.out.print(a[r][c]+" ");
				
			}
			
		}

}
}
