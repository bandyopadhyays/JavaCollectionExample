package javacollection.map.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * hash map implements MAP interface.
 * it stores data in key value pair. 
 * Does not contain duplicate key. 
 * can contain one null key.
 * value can be duplicate.
 * map contains data in shorted order, so no insertion order maintain. 
 */

public class HashMapJava {
	
	public static void main(String[] args) {
		HashMap<Integer, String> m1 = new HashMap<Integer, String>();
		
		//to add data put method
		
		m1.put(1, "souni");
		m1.put(5, "banerjee");
		m1.put(3, "shamik");
		m1.put(2, "sen");
		System.out.println("MAP m1 - "+m1);
		
		// what happen when we put value with duplicate key? previous value will be replaced with new value.
		
		m1.put(4, "value");
		System.out.println("m1 -"+m1);
		m1.put(4, "new value");
		System.out.println("after adding new dup key m1 -"+m1);
		
		// to retrieve value -
		
		System.out.println(m1.get(4));
		
		// Entry is the sub interface of Map. So we will be accessed it by Map.Entry name. It provides methods to get key and value.
		System.out.println("printing map with entry set");
		for(Map.Entry<Integer, String> m : m1.entrySet()){
			System.out.println(m.getKey()+"---"+m.getValue());
		}
		
		// how to iterate over the map? --> through KeySet
		
		Set<Integer> eSet1 = m1.keySet();
		for(int i : eSet1) {
			System.out.println("Value of key - "+i+" is "+m1.get(i));
		}
		
		// containskey & contains value
		
		if(m1.containsKey(7)){
			System.out.println("map has key 7");
		} else {
			System.out.println("map does not have key 7");
		}
		
		if(m1.containsValue("banerjee")) {
			System.out.println("map has value banerjee");
		} else {
			System.out.println("map does not have value banerjee");
		}
		
		// Creating MAP with user defined object
		
		HashMap<String, Price> hm1 = new HashMap<String, Price>();
		hm1.put("Apple", new Price("Apple",80));
		hm1.put("Mango", new Price("Mango",180));
		hm1.put("Banana", new Price("Banana",30));
		//System.out.println(hm1);
		Set<String> ks = hm1.keySet();
		
		for(String s : ks) {
			hm1.get(s).print();
		}
		
		
	}

}
