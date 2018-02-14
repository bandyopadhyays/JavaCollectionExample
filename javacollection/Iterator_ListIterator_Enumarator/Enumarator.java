package javacollection.Iterator_ListIterator_Enumarator;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.ListIterator;
import java.util.Vector;

/**
 * Iterator is a fail-fast in nature. i.e it throws
 * ConcurrentModificationException if a collection is modified while iterating
 * other than it’s own remove() method. Where as Enumeration is fail-safe in
 * nature. It doesn’t throw any exceptions if a collection is modified while
 * iterating.
 * 
 *
 */

public class Enumarator {
	/**
	 * add element method serve the same as add add comes with list interface
	 * where as addelement in vector class method.
	 * 
	 */

	public static void main(String[] args) {
		Vector<Object> v = new Vector<Object>();
		v.add("Souni");
		v.add(1);
		v.add('c');
		v.addElement("banerjee");
		System.out.println("vector is: " + v);
		Enumeration<Object> en = v.elements();
		while (en.hasMoreElements()) {
			System.out.println(en.nextElement());
		}

		// now add more elements to the vector.
		v.add(true);
		v.add(false);

		// since enumaration is fail safe you can use that but it will print the
		// newly added elements. because pointer will be on last element.

		while (en.hasMoreElements()) {
			System.out.println(en.nextElement());
		}
		System.out.println("----------------------------------------------------------");

		// now try same with iterator/list iterator.

		ArrayList<Object> list = new ArrayList<Object>();
		list.add(8);
		list.add(1);
		list.add("souni");
		ListIterator<Object> it = list.listIterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		// now add more element to list

		list.add("banerjee");

		// now use the same iterator will case exception

		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
