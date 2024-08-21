package collection;

import java.util.ArrayList;

public class ArrayList_Methods {

	public static void main(String[] args) {
		
		ArrayList a = new ArrayList();
		
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
		
		a.add(12);
		a.add(12.50);
		System.out.println(a);
		
		ArrayList a1 = new ArrayList();
		a1.addAll(a);
		System.out.println(a1);
		
		System.out.println(a.equals(a1));
		
		System.out.println(a.size());
		
		System.out.println(a.contains("12"));
		System.out.println(a.containsAll(a1));
		
		a1.clear();
		
		System.out.println(a1);
		
		System.out.println(a.isEmpty());

	}

}
