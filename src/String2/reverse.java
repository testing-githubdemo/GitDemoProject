package String2;

public class reverse {

	public static void main(String[] args) {
		//Reverse String Program
	 String s1="Hello";
	 int len=s1.length();
	 System.out.println(len);
	 String reverse="";
	 System.out.println("Orignal String: "+s1);
	       //11-1   11>=0 true
	                //10>=0
	               //0>=0
	        // 5+1=6
	         //  6-1		5>=0  
	                       //4>=0
	                      //3>=0
	 for(int i=len-1;i>=0;i--)
	 {
		     
		 //""+s1.charAt(10)=n
		         //n+s1.charAt(9)=o
		         // =""+s1.charAt(5);//o
		          //""+o=o
		                //o+l=//ol
		                //ol+l//oll
		 reverse=reverse+s1.charAt(i);
		 //noitamotuA
	 }
	 System.out.println("Reverse srting: "+reverse);
	 

	}

}
