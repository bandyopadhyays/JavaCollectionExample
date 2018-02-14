package javacollection.queue.Deque;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 
 * The ArrayDeque class provides the facility of using deque and
 * resizable-array. It inherits AbstractCollection class and implements the
 * Deque interface.
 * 
 * Null elements are not allowed in the ArrayDeque.
 * we can add or remove elements from both sides.
 * ArrayDeque is not thread safe
 * ArrayDeque is faster than LinkedList and Stack.
 * add() -> adding element
 * offer() -> adding element in priority queue
 * basically both works same difference is add will throw exception if it can not add element.
 * offer will return false if it can not add element.
 * element() -> It is used to retrieves, but does not remove, the head of this queue. it throws exception if queue is null. 
 * peek() -> Retrieves, but does not remove, the head of this queue, or returns null if this queue is empty.
 * remove() -> It is used to retrieves and removes the head of this deque.
 * poll() -> It is used to retrieves and removes the head of this deque, or returns null if this deque is empty.
 *
 */

public class DequeJava {
	
	public static void main(String[] args) {
		
		Deque<String> dq1 = new ArrayDeque<String>();
		dq1.add("souni");
		dq1.add("ban");
		dq1.add("babai");
		dq1.add("banerjee");
		dq1.add("allstate");
		dq1.add("technosoft");
		dq1.add("teoco");
		dq1.add("howrah");
		dq1.add("kolkata");
		dq1.add("bangalore");
		dq1.add("mb");
		dq1.add("true");
		dq1.add("false");
		dq1.offer("true1");
		dq1.offer("false1");
		
		System.out.println("element() -> ");
		System.out.println(dq1.element());
		System.out.println("peek() -> ");
		System.out.println(dq1.peek());
		//System.out.println("");
		//System.out.println(dq1.);
	}

}
