package javacollection.queue.PriorityQueue;

import java.util.Iterator;
import java.util.PriorityQueue;

/**
 * 
 * The PriorityQueue class provides the facility of using queue. But it does not
 * orders the elements in FIFO manner. It inherits AbstractQueue class.
 *
 * add() -> adding element
 * offer() -> adding element in priority queue
 * basically both works same difference is add will throw exception if it can not add element.
 * offer will return false if it can not add element.
 * element() -> It is used to retrieves, but does not remove, the head of this queue. it throws exception if queue is null. 
 * peek() -> Retrieves, but does not remove, the head of this queue, or returns null if this queue is empty.
 * remove() -> It is used to retrieves and removes the head of this deque.
 * poll() -> It is used to retrieves and removes the head of this deque, or returns null if this deque is empty.
 */

public class ProrityQueueJava {

	public static void main(String[] args) {
		PriorityQueue<String> pq1 = new PriorityQueue<String>();
		pq1.add("Souni");
		pq1.add("banerjee");
		pq1.add("allstate");
		pq1.add("technosoft");
		pq1.add("150");
		pq1.add("false");
		pq1.offer("true");
		System.out.println("Element in pq1 - ");
		Iterator<String> it1 = pq1.iterator();
		while(it1.hasNext()) {
			System.out.println(it1.next());
		}
		System.out.println("Head element using element() - ");
		System.out.println(pq1.element());
		System.out.println("Head element using peak() - ");
		System.out.println(pq1.peek());
		System.out.println("using remove() - ");
		System.out.println(pq1.remove());
		System.out.println("uning poll() - ");
		System.out.println(pq1.poll());
	}
}
