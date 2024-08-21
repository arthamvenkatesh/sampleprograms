package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListInterface {

	public static void main(String[] args) {

		List l1 = new ArrayList();

		l1.add("abc");
		l1.add(123);
		l1.add(85.26);

		System.out.println(l1); // indexing - follow
		System.out.println(l1); // oreder execution true
		System.out.println(l1); // accept hetrogenious values
		System.out.println(l1); // dynamic nature
		l1.add(null);
		l1.add(null);
		System.out.println(l1); // accepting nulls
		l1.add(101);
		l1.add(101);
		System.out.println(l1);// adding duplicates
		
		List l4 = new ArrayList();
		l4.add(1010);
		l4.add(2323);
		l4.add(15);
		l4.add(500);
		System.out.println("before sort: "+l4);
		Collections.sort(l4);
		System.out.println("after sort: "+l4); // sorting need to done
		
		List l2 = new ArrayList();
		l2.add(100);
		l2.add(99);
		l2.add(2002);
		l2.add(2);
		System.out.println("before sort: "+ l2);
		
		Collections.sort(l2);
		System.out.println("after sort: "+ l2);
		
		 Iterator i2 = l2.iterator();
		while(i2.hasNext()) {
			System.out.println(i2.next());
		}
		
		System.out.println("-----------------------");
		
		ListIterator ll = l2.listIterator();
		
		while(ll.hasNext()) {
			System.out.println(ll.next());
		}
		
		System.out.println("-----------------------");
		
		while(ll.hasPrevious()) {
			System.out.println(ll.previous());
		}

		System.out.println("-----------------------");
	}
}
