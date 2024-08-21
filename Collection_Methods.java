package collection;

import java.util.ArrayList;
import java.util.Collection;

public class Collection_Methods {

	public static void main(String[] args) {
		
		Collection c1 = new ArrayList();
		
		/*add
		addAll
		remove
		removeAll
		contains
		containsAll
		equals
		clear
		isEmpty
		size
		iterator*/
		
		c1.add(1);
		c1.add("a");
		c1.add(2.0);
		c1.add(true);
		System.out.println(c1); // follotw the orderofinsertion, indexing
		
		Collection c2 = new ArrayList();
		c2.addAll(c1);
		c2.add("extra one element");
		System.out.println(c2); // addAll
		
		c2.remove("extra one element");
		System.out.println(c2); // remove
		
		System.out.println(c1.contains(2.0)); // contains
		
		System.out.println(c1.containsAll(c2)); // containsAll
		
		System.out.println(c1.equals(c2)); // equals
		
		Collection c3 = new ArrayList();
		c3.add(1.2);
		System.out.println("C3 collection having objects are :" +c3);
		
		c3.clear();
		System.out.println(c3); //clear
		
		System.out.println(c3.isEmpty()); // isEmpty
		

	}

}
