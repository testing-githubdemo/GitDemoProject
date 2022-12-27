package StringDemo;

public class maxno {

	public static void main(String[] args) {
		int a[]={2,5,4,8,10};
		int max=a[0];
		for(int i=0;i<a.length;i++)
		{
		if(a[i]>max)
		{
		max=a[i];
		}
		//System.out.println(max);
		}
		System.out.println(max);

	}

}
