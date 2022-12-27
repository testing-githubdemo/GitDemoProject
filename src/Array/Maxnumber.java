package Array;

public class Maxnumber {

	public static void main(String[] args) {
		int a[]= {20,78,60,100,400,300,490,1000};
		System.out.println(a.length);
		System.out.println("Length");
		int max=a[0];
		
		
		//20=20
		//78
				//20
		//78
		
		//2=60
		//3=100
		//4=400
		//5=300
		//6=490
		//7=1000
		//8=false
		for(int i=0;i<a.length;i++)
		{//20>20//false
			//78>20
			//60>78
			//100>78
			//400>100
			//300>400
			//490>400
			//1000>490
			if(a[i]>max)
			{
				//100=100
				//400
				//490
				//1000
				max=a[i];
				//System.out.println(max);
			}
		}
		System.out.println(max);
		
	}

}
