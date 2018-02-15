package javacollection.map.LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 
 * Similar to HashMap 
 * Maintain insertion order - IMP 
 *
 */

public class LinkedHastMapJava {

	public static void main(String[] args) {
		Map<Integer, String> lhm = new LinkedHashMap<Integer, String>();
		lhm.put(1, "souni");
		lhm.put(10, "banerjee");
		lhm.put(5, "allstate");
		
		for(Map.Entry<Integer, String> m : lhm.entrySet()) {
			System.out.println(m.getKey() + "---" + m.getValue());
		}
	}
}
