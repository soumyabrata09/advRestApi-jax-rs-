/**
 * 
 */
package com.REST.advRestaAPI.services;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Sam
 *
 */
//@XmlRootElement
public class wordCounter {

	public static String printFrequencyOfLetter( String str) {
		String ret_stmt = "";
		Map<Character,Integer> tree_map = new TreeMap<Character,Integer>();
		for(int i = 0; i < str.length() ; i++) {
			Integer occurrences = tree_map.get(str.charAt(i));
			if( tree_map.get(str.charAt(i)) == null)
				tree_map.put(str.charAt(i), 1);
			else
				tree_map.put(str.charAt(i), ++occurrences);
		}
		for(@SuppressWarnings("rawtypes") Map.Entry mentry : tree_map.entrySet()) {
			//System.out.println("Element " + mentry.getKey() +" Occurred : " +mentry.getValue()+" times.");
			ret_stmt += "Element " + mentry.getKey() +" Occurred : " + mentry.getValue() + " times. "
					+ "\n";
		}
		  return ret_stmt;
	}
	public void printFrequencyOfNumber( int[] ar) {
		Map<Integer,Integer> hmap = new HashMap<Integer,Integer>();
		for(int i = 0; i < ar.length ; i++) {
			Integer occurrences = hmap.get(ar[i]);
			if( hmap.get(ar[i]) == null)
				hmap.put(ar[i], 1);
			else
				hmap.put(ar[i], ++occurrences);
		}
		for(@SuppressWarnings("rawtypes") Map.Entry mentry : hmap.entrySet())
		  System.out.println("Element " + mentry.getKey() +" Occurred : " +mentry.getValue()+" times.");
	}
}
