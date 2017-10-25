package javacollection.set.linkedhashset;

import java.util.LinkedHashSet;

/**
 * Implements Set interface.
 * Does not allow to insert duplicate objects.
 * MAINTAINS INSERTION ORDER --> IMP
 */

public class LinkedhashSetJava {
	
	public static void main(String[] args) {
		LinkedHashSet <Integer> s1 = new LinkedHashSet<Integer>();
		s1.add(50);
		s1.add(1);
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
	}

}
