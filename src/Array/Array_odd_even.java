package Array;



public class Array_odd_even {

	public static void main(String[] args) {
	int num[]= {1,3,5,2,6,8,9};	
	System.out.println(num.length);
	//Arrays.sort(num);
	for(int i=0;i<num.length;i++)
	{
		if(num[i] %2==0)
		{
			System.out.println("Even Number:"+num[i]);
		}
		//if(num[i]%2 !=0)
		else
		{
			System.out.println("Odd Number: "+num[i]);
		}
	}
	}

}
