package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class Arraylist2{

public static void main(String[] args) {
		
		ArrayList<String> AL=new ArrayList();
		
		AL.add("a");
		AL.add("c");
		AL.add("d");
		AL.add("b");
		
		System.out.println(AL);
		
		ArrayList duplicate = new ArrayList();
		
		// Addall
		duplicate.addAll(AL);
		System.out.println(duplicate);
		
		duplicate.removeAll(AL);
		System.out.println("After Removing :"+duplicate);
		
		//Collection method
		System.out.println("Element in the array list :"+AL);
		Collections.sort(AL);
		System.out.println("Element in the array list after sorting :"+AL);
		
		Collections.sort(AL,Collections.reverseOrder());
		System.out.println("Elementin the array list after sortingin reverse order :"+AL);
		
		Collections.shuffle(AL);
		System.out.println("Element in the array list after shuffle: "+AL);
		
	}

}
