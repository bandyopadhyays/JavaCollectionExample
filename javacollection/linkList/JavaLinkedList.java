package javacollection.linkList;

import java.util.LinkedList;
import java.util.List;

public class JavaLinkedList {
	/**
	 * Similar to Array List Difference between ArrayList and and LinkedList is
	 * only with internal architecture as it implements double link list. so
	 * insertion and deletion is easier.
	 * so if you have  through index it is recommended to use ArrayList as it works faster. 
	 * but deletion is slower in array list as it requires lots of shifting. 
	 */
	public static void main(String[] args) {
		// create on LinkedList
		List<Object> li1 = new LinkedList<Object>();
		li1.add(true);
		li1.add(2);
		li1.add("Allstate");
		li1.add(null);
		System.out.println(li1);

	}

}
