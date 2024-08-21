package collection;

import java.util.HashSet;

public class HashSet_Program {

	public static void main(String[] args) {
		
		HashSet hs = new HashSet();

		hs.add(100);
		hs.add(550);
		hs.add(null);
		hs.add(null);
		hs.add("name");
		hs.add(569.36);


		System.out.println(hs);
	}

}
