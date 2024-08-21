package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Collection1 {

	public static void main(String[] args) {
		
		Collection c1= new ArrayList();
		//upcasting from ArrayList to Collection interface.
		// accesssing all collections methods
		
		c1.add("abc");
		c1.add(12.52);
		c1.add(true);
		c1.add(null);
		c1.add(null);
		c1.add(100);
		c1.add(569);
		c1.add(569);
		System.out.println("Collection C1 --> " +c1);
		
		
		Collection c2 = new ArrayList();
		c2.add(555);
		c2.add(666);
		c2.addAll(c1);
		System.out.println("Collection C2 --> "+c2);
		
		Collection c3 = new ArrayList();
		c3.add(54);
		c3.add(54);
		
		Collection c4 = new ArrayList();
		c4.add(54);
		c4.add(54);
		
		boolean b = c4.equals(c3);
		System.out.println("Collection c3 and c4 are equal : "+b);
		
		Collection c5 = new ArrayList();
		System.out.println("c5 Collection is empty : "+c5.isEmpty());
		
		Collection c6 = new ArrayList();
		c6.add(10);
		c6.add(20);
		System.out.println("Before Clear c6 is: "+ c6);
		c6.clear();
		System.out.println("After Clear c6 is : "+c6);
		
		Collection c7 = new ArrayList();
		c7.add(100);
		c7.add(200);
		c7.remove(100);
		System.out.println(c7);
		
		Collection c8 = new ArrayList();
		c8.add(111);
		c8.add(222);
		c8.removeAll(c8);
		System.out.println(c8); 
		
		Collection c9 = new ArrayList();
		c9.add(1);
		c9.add(2);
		c9.add(3);
		
		Collection c10 = new ArrayList();
		c10.add(1);
		c10.add(2);
		c10.add(3);
		
		Iterator i1 = c9.iterator();
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}
		
		System.out.println("Size is :" +c9.size());
		System.out.println("is empty: "+c9.isEmpty());
		
		System.out.println("object is found : "+c9.contains(2));
		System.out.println("Contains : "+c10.containsAll(c9));

	}

}
