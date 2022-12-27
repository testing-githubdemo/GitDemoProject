package contructor;

public class constuctor_para {
	int no;
	 String nm;
	
	float fl;
	double d;
	 public constuctor_para() {
		// TODO Auto-generated constructor stub
	 
		
	}
	public constuctor_para(int a, float f)
	{
	no=a;
    fl=f;
	
		
	}
	public constuctor_para(float f1,double d1)
			
	{
		fl=f1;
		d=d1;
		//nm=nm2;
	}
	public constuctor_para(String nm1)
	{
		nm=nm1;
		//this.no=no;
		
	}
	public void add()
	{
		System.out.println(no+fl);
	}

	public void sub()
	{
		System.out.println(fl-d);
	}
	
	public static void main(String[] args) {
  constuctor_para c1=new constuctor_para(10,20.5f);
  System.out.println(c1.no +" "+c1.fl);
  constuctor_para c2=new constuctor_para(10.5f,15.5);
  System.out.println(c2.fl+" "+c2.d);
  constuctor_para c3=new constuctor_para("poonam");
  System.out.println(c3.nm);
  //System.out.println(c3.nm);
  c1.add();
  c2.sub();
  
  
  
	}

}
