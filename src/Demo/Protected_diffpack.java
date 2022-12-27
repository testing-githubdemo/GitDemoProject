package Demo;

import AccessSpecifier.Protected_Access;

public class Protected_diffpack extends Protected_Access {

	public static void main(String[] args) {
		
		Protected_diffpack p=new Protected_diffpack();
		System.out.println(p.i);
		System.out.println(p.name);
		
		p.m1();

	}

}
