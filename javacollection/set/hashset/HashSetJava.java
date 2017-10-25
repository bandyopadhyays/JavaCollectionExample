package javacollection.set.hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * HashSet implements SET interface. 
 * HashSet is based on Hashing algorithm
 * HashSet does not maintain insertion order
 * HashSet does not allow duplicate data 
 * HashSet methods are similar to list classes.
 * allows to add null.
 */

public class HashSetJava {

	public static void main(String[] args) {
		Set s = new HashSet<>();
		s.add(1);
		s.add(1);
		s.add(true);
		System.out.println(s);
		
		HashSet <Integer> s1 = new HashSet<Integer>();
		s1.add(50);
		s1.add(1);
		s1.add(12);
		s1.add(123);
		s1.add(97);
		s1.add(212);
		s1.add(9);
		s1.add(7);
		s1.add(73);
		s1.add(null);
		System.out.println(s1);
		
		// example to iterator for SET
		Iterator<Integer> it = s1.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
