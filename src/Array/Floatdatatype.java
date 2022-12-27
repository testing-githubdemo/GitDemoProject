package Array;

import java.util.Arrays;

public class Floatdatatype {

	public static void main(String[] args) {
	
		float f[]=new float[5];
		f[0]=20.2f;
		f[1]=10.3f;
		f[2]=30.2f;
		f[3]=40.2f;
		f[4]=5.5f;;
		System.out.println(f.length);//array length
		Arrays.sort(f);//sorted order
		for(int i=0;i<f.length;i++)
		{
			System.out.println(f[i]);
		}
	}

}
