package hackerrank;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class SecondHighestFreqChar {

	public static void main(String[] args) {
		//System.out.println(get2ndMostFreq("aaabbbbccbca"));
		secondhigh("aaaabbbbbcc");
		
	}
	static final int NOOFCHARS = 256;
	 static char get2ndMostFreq(String str) {

	  int[] c = new int[NOOFCHARS];
	  for (int i = 0; i < str.length(); i++)
	   (c[str.charAt(i)]) ++;

	  int first = 0, second = 0;
	  for (int i = 0; i < NOOFCHARS; i++) {
	   if (c[i] > c[first]) {
	    second = first;
	    first = i;
	   } else if (c[i] > c[second] && c[i] != c[first])
	    second = i;
	  }
	  return (char) second;
	 }

	 public static void secondhigh(String s) {
		 int[] c=new int[256];
		 for(int i=0;i<s.length();i++) {
			 c[s.charAt(i)]++;
		 }
		 int second=0, first=0;
		 for(int i=0;i<256;i++) {
			 if(c[i]>c[first]) {
				 second=first;
				 first=i;
			 }
		 }
		 System.out.println((char)second);
	 }
	 
	 public static void getSeconHighChar(String s) {
			
			Map<Character, Integer> map = new HashMap<Character, Integer>();
			
			for(int i=0;i<s.length();i++) {
				if(map.containsKey(s.charAt(i))) {
					map.put(s.charAt(i), map.get(s.charAt(i))+1);
				}else {
					map.put(s.charAt(i), 1);
				}
			}
			
			System.out.println(map);
			
			
			List<Map.Entry<Character, Integer>> list = new LinkedList<Map.Entry<Character, Integer>>(map.entrySet());
			
			Collections.sort(list, new Comparator<Map.Entry<Character, Integer>>() {
				public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
					return (o2.getValue()).compareTo(o1.getValue());
				}
			});
			
			HashMap<Character, Integer> temp = new LinkedHashMap<Character, Integer>();
			
			for(Map.Entry<Character, Integer> entry : list) {
				temp.put(entry.getKey(), entry.getValue());
			}
			
			System.out.println(temp);
		}
}
