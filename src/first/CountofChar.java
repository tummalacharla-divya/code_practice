package first;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class CountofChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(count("aahsjjbcnhjdm"));

	}
	public static Integer count(String str) {
		LinkedHashMap<Character,Integer> h= new LinkedHashMap<Character,Integer>();
		for(int i=0;i<str.length();i++) {
			if(h.containsKey(str.charAt(i))) {
				h.put(str.charAt(i), h.get(str.charAt(i))+1);
			}
			else {
				h.put(str.charAt(i), 1);
			}
		}
		for(Character c:h.keySet()) {
			if(c=='a') {
				return h.get(c);
			}
		}
		return 0;
	}

}
