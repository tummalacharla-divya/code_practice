package codeChallenge30Days;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class DuplicateStrings{

	
	public static void main(String[] args) {
		
		System.out.println(Arrays.toString(getNonDuplicate("jaeaeaagaedeesh")));
	}
	
	//10
	
	
	public static Object[] getNonDuplicate(String array) {
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(int i=0;i<array.length();i++) {
			if(map.containsKey(array.charAt(i))) {
				map.put(array.charAt(i), map.get(array.charAt(i))+1);
			}
			else {
				map.put(array.charAt(i), 1);
			}
		}

		int max = 1;
		char highestRepeatedChar = ' ';
		for(Character str: map.keySet()) {
			if(map.get(str) > max) {
				max = map.get(str);
				highestRepeatedChar = str;
			}
		}
		
		return new Object[] {highestRepeatedChar ,max};
	}
	
}
