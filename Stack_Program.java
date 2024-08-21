package collection;

import java.util.Stack;

public class Stack_Program {

	public static void main(String[] args) {
		
		Stack s =new Stack();
		
		s.add(100);
		s.add(100);
		s.add(100);
		s.add(100);
		
		s.add(null);
		s.add(null);
		s.add(null);
		
		s.add(123);
		s.add("name");
		s.add(540.236);
		s.add("name");
		System.out.println(s);
		

	}

}
