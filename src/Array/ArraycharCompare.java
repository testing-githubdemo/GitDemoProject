package Array;

public class ArraycharCompare {

	public static void main(String[] args) {

char c[]= {'b','c','a','a','c','d','f','f'};
String s[]= {"Hello","Hii","Hello","Hii"};
System.out.println(s.length);
System.out.println(c.length);
System.out.println("Duplicate Characters :");
       
for(int i=0;i<c.length;i++)
{
	for(int j=i+1;j<c.length;j++)
	{
		if(c[i]==c[j])
		{
			System.out.print(c[j]+" ");
		}
		}
	}


for(int i=0;i<s.length;i++)
{
	for(int j=i+1;j<s.length;j++)
	{
		if(s[i]==s[j])
		{
			System.out.print(s[j]+" ");
		}
	}
}


	}

}
