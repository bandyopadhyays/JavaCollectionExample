package javacollection.vectors;

import java.util.List;
import java.util.Vector;

public class JavaVector {
	 /**
     * vector implements List interface.
     * Difference between vector and linkedlist/array list is vector is
thread safe.
     * if multiple threads are working on linkedlist/arraylist data
corruption may happen but for vector it wont have any affect.
     *
     *1)ArrayList is not synchronized.      Vector is synchronized.
     *2) ArrayList increments 50% of current array size if number of element
exceeds from its capacity.      Vector increments 100% means doubles the
array size if total number of element exceeds than its capacity.
     *3) ArrayList is not a legacy class, it is introduced in JDK 1.2.      Vector
is a legacy class.
     *4) ArrayList is fast because it is non-synchronized.  Vector is slow
because it is synchronized i.e. in multi threading environment, it will
hold the other threads in runnable or non-runnable state until current
thread releases the lock of object.
     *5) ArrayList uses Iterator interface to traverse the elements.        Vector
uses Enumeration interface to traverse the elements. But it can use
Iterator also.


     */

    public static void main(String[] args) {
    	// vector implements List interface so it has similar methods like ArrayList
    	
    	List <Object> vector = new Vector<Object>();
    	vector.add(10);
    	vector.add(1);
    	vector.add(true);
    	vector.add('c');
    	vector.add("String");
    	vector.add(2.8);
    	vector.add(null);
    	System.out.println(vector);
    	// to clear collection ->
    	vector.clear();
    	System.out.println(vector.isEmpty());
    	
    	

    }

}
