package control_statement;

public class if_elseif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks=25;
		if(marks>=75)
			
		{
			System.out.println("Distinction");
		}
		else if(marks<=75 && marks >=65)
		{
			System.out.println("Pass Class");
		}
		else if (marks<=64 && marks >=55)
		{
			System.out.println("Second Class");
		}
		else if (marks <54 && marks >35)
		{
			System.out.println("Pass Class");
		}
		else
		{
			System.out.println("Fail");
		}
			
			
			

	}

}
