package first;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class DuplicateChar {

	public static void main(String args[]) {
		String str = "divya";
		String str2 = "fivvt";

		char[] charArray = str.toCharArray();
		char[] charArray2 = str2.toCharArray();

		ArrayList<String> s = new ArrayList<String>();
		for (int i = 0; i < charArray.length; i++) {
			char c = charArray[i];
			s.add(String.valueOf(c));
		}

		ArrayList<String> s2 = new ArrayList<String>();
		for (int i = 0; i < charArray2.length; i++) {
			char c = charArray2[i];
			s2.add(String.valueOf(c));
		}

		s2.retainAll(s);
		Iterator<String> iter = s2.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}

		System.out.println("------------------");

		Set<String> set = new HashSet<String>(s);
		Set<String> set2 = new HashSet<String>(s2);

		set2.retainAll(set);

		Iterator<String> iter2 = set2.iterator();
		while (iter2.hasNext()) {
			System.out.println(iter2.next());
		}

	}
}
