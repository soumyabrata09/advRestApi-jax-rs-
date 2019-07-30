/**
 * 
 */
package com.REST.advRestaAPI.services;

import java.util.Arrays;

/**
 * @author Sam
 *
 */
public class testAnagram {
	public static String isAnagram(String str1, String str2) {
		if( str1.length() != str2.length())
		{
			//System.out.println("Unequal Strings..");
			return "Unequal Strings..";
		}
		else {
		char[] char1 = str1.toCharArray(), char2 = str2.toCharArray();
		Arrays.sort(char1);
		Arrays.sort(char2);
		if( String.valueOf(char1).equals(String.valueOf(char2))) {
			//System.out.println("Anagram Strings.."); 
			return "Anagram Strings..";
		}
		else {
			//System.out.println("Not Anagram Strings.."); 
			return "Not Anagram Strings..";
		}
		}
	}
	

}
