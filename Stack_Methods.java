package collection;

import java.util.Collections;
import java.util.Stack;

public class Stack_Methods {

	public static void main(String[] args) {
		
		Stack s = new Stack();
		
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);


		System.out.println("Stack Elements are: "+s);
		System.out.println("Return Element from Top : "+ s.peek()); // return the top element
		System.out.println("Remove Element from Top : "+ s.pop()); // remove the top element top and print that
		System.out.println("After removing elements : "+s); // after removing top element and display remain elements
	}

}
