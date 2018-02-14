package javacollection.set.treeset;

import java.util.TreeSet;

/**
 * Maintain ascending order
 * Does not allow duplicate value.
 * Access and retrieval times are quiet fast. as it implements navigableset
 * does not have null value. 
 */

public class TreeSetJava {

	public static void main(String[] args) {
		TreeSet<Integer> s1 = new TreeSet<Integer>();
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
		// s1.add(null);
		System.out.println(s1);
	}
}
