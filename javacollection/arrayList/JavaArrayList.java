package javacollection.arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class JavaArrayList {
	/**
	 * ArrayList is a class implements List interface. Array list
	 * increase/decrease its size dynamically upon adding or deleting elements.
	 * ArrayList maintains its insertion order. ArrayList in non synchronized
	 * ArrayList allows random access since array works on index Data
	 * manipulation is slow as once data deleted lots of shifting need to be
	 * performed.
	 * allows to add null.
	 * Collection does not entertain premetive data types. internally it use Integer.parseint -> for int
	 **/

	public static void main(String[] args) {
		// Create non generic ArrayList
		// non generic array list will have a warning of rawtype since data time
		// has not provided.
		List li1 = new ArrayList();
		li1.add(2);
		li1.add("Souni");
		li1.add(true);
		li1.add('c');
		System.out.println("Printing li1 " + li1);

		// Create generic Arraylist
		List<Integer> li2 = new ArrayList<Integer>();
		li2.add(1);
		li2.add(5);
		li2.add(3);
		li2.add(null);
		System.out.println("Printing li2 " + li2);

		// Create generic array list with different data type.
		// use object since object is parent of all java class
		List<Object> li3 = new ArrayList<Object>();
		li3.add(2);
		li3.add(2);
		li3.add("Souni");
		li3.add(true);
		li3.add('c');
		System.out.println("Printing li3 " + li3);

		// Add data based on index
		li3.add(2, "banerjee");
		System.out.println("Printing li3 after ading data in index 2 " + li3);

		// delete based on index
		li3.remove(1);
		System.out.println("Printing li3 after deletion of data in index 1 " + li3);

		// creating another array list with integer data
		List<Integer> li4 = new ArrayList<Integer>();
		li4.add(1);
		li4.add(5);
		li4.add(3);
		li4.add(3);
		li4.add(90);
		li4.add(31);
		li4.add(72);
		System.out.println("Printing li2 " + li4);

		// getting/traversing all value of Array list.
		// option one :- using iterator
		Iterator<Integer> it4 = li4.iterator();
		System.out.println("Printing the element of list4 using iterator");
		while (it4.hasNext()) {
			System.out.print(it4.next() + " ");
		}
		System.out.println();
		// getting/traversing all value of Array list.
		// option one :- using for each loop
		System.out.println("Printing the element of list4 using for each loop");
		for (int i : li4) {
			System.out.print(i + " ");
		}
		System.out.println();

		// get data using index
		System.out.println("data on index 2 : " + li4.get(2));

		// using add all one collection can be added in list collection
		List<Integer> li5 = new ArrayList<Integer>();
		li5.add(99);
		li5.addAll(li4);
		System.out.println("List 5 - " + li5);

		// removeAll() method will remove all the matching element from two
		// collection
		List<Integer> li6 = new ArrayList<Integer>();
		li6.add(1);
		li6.add(2);
		li6.add(3);
		List<Integer> li7 = new ArrayList<Integer>();
		li7.add(2);
		li7.add(3);
		li7.add(4);
		li6.removeAll(li7);
		System.out.println("List after remove all " + li6);

		// retainAll() will keep the matching element from two collection
		List<Integer> li8 = new ArrayList<Integer>();
		li8.add(1);
		li8.add(2);
		li8.add(3);
		List<Integer> li9 = new ArrayList<Integer>();
		li9.add(2);
		li9.add(3);
		li9.add(4);
		li8.retainAll(li9);
		System.out.println("List after remove all " + li8);

		// creating list with user defined object
		List<Student> li10 = new ArrayList<Student>();
		Student s1 = new Student(1, "ab", 'a');
		Student s2 = new Student(2, "cd", 'b');
		Student s3 = new Student(3, "ef", 'c');
		li10.add(s1);
		li10.add(s2);
		li10.add(s3);
		System.out.println("user defined list");
		for (Student s : li10) {
			System.out.println(s.roll + " " + s.name + " " + s.clas);
		}

		// sorting list
		List<Integer> li11 = new ArrayList<Integer>();
		li11.add(2);
		li11.add(71);
		li11.add(20);
		li11.add(1);
		li11.add(13);
		Collections.sort(li11);
		System.out.println(li11);
	}

}
