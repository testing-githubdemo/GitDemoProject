package this_super;

public class this_keyward {
      String nm="Poonam";
      char grade='A';
	public static void main(String[] args) {
	this_keyward t1=new this_keyward();
	t1.m1();

	}
	public void m1()
	
	{
		String nm="Patil";
		
		System.out.println("Name "+this.nm);
		System.out.println("Name "+nm);
		System.out.println("Grade "+grade);
	}
	

}
