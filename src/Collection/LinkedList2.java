package Collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList2 {

	public static void main(String[] args) {
		// Declare Linked List
		
        LinkedList LL =new LinkedList();	  // 
        
       // LinkedList<Integer>LL1=new LinkedList<Integer>();
     
		
		//Add elemenet into LL
		
		LL.add(100);
		LL.add("Welcome");
		LL.add(15.5);
		LL.add('A');
		LL.add(true);
		LL.add(false);
		
		System.out.println(LL);
		
		
		//2. Remove
		LL.remove(4);
		System.out.println("Afterremoving new lsit :"+LL);
		
		// Add element in the middle of LL
		LL.add(4, "Rohit");
		System.out.println("After inserting element :"+LL);
		
		//Get - Return the element at the specified position in this LL
		System.out.println(LL.get(4));
		
		//Set Method - Replace/update or modified the elemet at the specifed position 
		LL.set(4, "Virat");
		System.out.println("After changing the value :"+LL);
		
		//Contains - Retrun true if the element is present in LL
		System.out.println(LL.contains("Virat"));
		System.out.println(LL.contains("Rohit"));
		
		//isEmpty
		System.out.println(LL.isEmpty());
		
		//Reading element from LL using for loop
		
		System.out.println("Reading element using for loop");
		for(int i=0;i<LL.size();i++) {
			System.out.println(LL.get(i));
		}
		System.out.println();
		System.out.println("Reading element using for each loop");
		for(Object obj:LL ) {
			System.out.println(obj);
		}
		System.out.println();
		System.out.println("Reading element using iterator");
		Iterator obj=LL.iterator();
		while(obj.hasNext()) {// If the next values is present it will give true
			System.out.println(obj.next());
		}
	}

}
