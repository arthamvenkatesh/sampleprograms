package collection;

import java.util.LinkedHashSet;

public class Linked_HashSet_Program {

	public static void main(String[] args) {
		
		LinkedHashSet lk = new LinkedHashSet();
		
		lk.add(100);
		lk.add(200.36);
		lk.add("abcd");
		lk.add(115);
		lk.add(null);
		lk.add(null);

		System.out.println(lk);
		

	}

}
