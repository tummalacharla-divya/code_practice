package first;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class DivideWordsFindDuplicate {

	
	public static void main(String args[]) {
		getDep("hello this is jagadeesh maaaaan");
	}
	

	public static void getDep(String sentance) {
		
		String[] words = sentance.split("\\W+");
		
		System.out.println(Arrays.asList(words));
		
		for(String word: words) {
			
			char[] characters = word.toCharArray();
			LinkedHashMap<Character, Integer> data = new LinkedHashMap<Character, Integer>();
			for(int i=0;i<characters.length;i++) {
				if(data.containsKey(characters[i])) {
					data.put(characters[i], data.get(characters[i])+1);
				}else {
					data.put(characters[i], 1);
				}
			}
			System.out.printf(word+"---> ");
			for(char c:data.keySet()) {
				if(data.get(c) > 1) {
					System.out.printf(c +" : "+data.get(c)+", ");
				}
			}
			System.out.println();
		}
		
	}
}
