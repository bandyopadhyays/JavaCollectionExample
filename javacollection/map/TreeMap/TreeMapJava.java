package javacollection.map.TreeMap;

import java.util.Map;
import java.util.TreeMap;

/**
 * 
 * maintain ascending order - IMP
 * can not have null key
 * can have null value
 *
 */

public class TreeMapJava {

	public static void main(String[] args) {
		TreeMap<Integer, String> tm = new TreeMap<Integer, String>();
		tm.put(1, "souni");
		tm.put(10, "banerjee");
		tm.put(77, "test1");
		tm.put(25, "test2");
		tm.put(9, "test3");
		
		for(Map.Entry<Integer, String> m : tm.entrySet()) {
			System.out.println(m.getKey() + "---" + m.getValue());
		}
		
		System.out.println(tm.firstKey());
		System.out.println(tm.lastKey());
		
		System.out.println(tm.firstEntry());
		System.out.println(tm.lastEntry());
		
	}
}
