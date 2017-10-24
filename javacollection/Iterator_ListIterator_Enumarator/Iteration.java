package javacollection.Iterator_ListIterator_Enumarator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

/*
 * Iterator - provided by collection. 
 * next() - will return the data and move the pointer to next data
 * hasnext() - checks whether it has next data or not.
 * remove() - will remove the data from collecction object.
 * 
 * LIST Iterator - provide by list interface
 * Advantage - it has a facility to traverse backward
 * addition methods in list iterator - 
 * hasPrevious() -  checks whether it has previous data or not.
 * previous() - will return the previous data
 * 
 *  
 */

public class Iteration {
	
	public static void main(String[] args) {
	
		// example of iterator with ArrayList
		List<Object> alist = new ArrayList<Object>();
		alist.add(1);
		alist.add(2.5);
		alist.add('c');
		alist.add("String");
		alist.add(true);
		System.out.println("List is - "+alist);
		Iterator itr1 = alist.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
			itr1.remove();
		}
		System.out.println("After operation - "+alist);
		System.out.println("------------------end of array list example ---------------------");
		
		// example of iterator with linklist
		List<Object> llist = new LinkedList<Object>();
		llist.add(1);
		llist.add(2.5);
		llist.add('c');
		llist.add("String");
		llist.add(true);
		System.out.println("List is - "+llist);
		Iterator itr2 = llist.iterator();
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
			itr2.remove();
		}
		System.out.println("After operation - "+llist);
		System.out.println("------------------end of linked list example ---------------------");
		
		// example of iterator with vector
		List<Object> vlist1 = new Vector<Object>();
		vlist1.add(1);
		vlist1.add(2.5);
		vlist1.add('c');
		vlist1.add("String");
		vlist1.add(true);
		System.out.println("List is - "+vlist1);
		Iterator itr3 = vlist1.iterator();
		while(itr3.hasNext()) {
			System.out.println(itr3.next());
			itr3.remove();
		}
		System.out.println("After operation - "+vlist1);
		System.out.println("------------------end of vector example ---------------------");
		
		// example of List Iterator with ArrayList
		List<Object> alist1 = new ArrayList<Object>();
		alist1.add(1);
		alist1.add(2.5);
		alist1.add('c');
		alist1.add("String");
		alist1.add(true);
		System.out.println("List is - "+alist1);
		ListIterator itr4 = alist1.listIterator();
		while(itr4.hasNext()) {
			System.out.println(itr4.next());
			//itr4.remove();
		}
		System.out.println("backward direction");
		while(itr4.hasPrevious()) {
			System.out.println(itr4.previous());
			//itr4.remove();
		}
		System.out.println("------------------end of array list example ---------------------");
		
		// example of List Iterator with LinkedList
		List<Object> llist1 = new LinkedList<Object>();
		llist1.add(1);
		llist1.add(2.5);
		llist1.add('c');
		llist1.add("String");
		llist1.add(true);
		System.out.println("List is - "+llist1);
		ListIterator <Object> itr5 = llist1.listIterator();
		while(itr5.hasNext()) {
			System.out.println(itr5.next());
			//itr2.remove();
		}
		System.out.println("backward direction");
		while(itr5.hasPrevious()) {
			System.out.println(itr5.previous());
			//itr4.remove();
		}
		System.out.println("------------------end of linked list example ---------------------");

		
		
		
		
		
		
	} 
	
	

}
