package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetInterface {

	public static void main(String[] args) {

		Set s1 = new HashSet();

		s1.add(100);
		s1.add(1);
		s1.add(83);
		s1.add("manish");
		s1.add(40.12);
		System.out.println(s1); // order of execution and indexing - false
		System.out.println(s1); // dynamic nature and hetrogenious true
		s1.add("manish");
		s1.add("manish");
		System.out.println(s1); // duplication -false
		s1.add(null);
		System.out.println(s1);
		s1.add(null);
		s1.add(null);
		System.out.println(s1); // acception one null value System.out.println(s1);
		// by default sorting

		Set s3 = new HashSet();
		s3.add(10);
		s3.add(202);
		s3.add(1);
		
		System.out.println(s3);

		Iterator i6 = s3.iterator(); // only supports iterator

		while (i6.hasNext()) {
			System.out.println(i6.next());
		}

	}

}
