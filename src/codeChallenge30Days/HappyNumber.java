package codeChallenge30Days;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
	public static void main(String[] args) {
		System.out.println(checkHappyNumber(82));
	}

	public static int getHappyNumber(int n) {

		int sum = 0;
		while (n != 0) {
			int digit = n % 10;
			n /= 10;
			sum += digit * digit;
		}
		return sum;
	}

	public static Boolean checkHappyNumber(int n) {
		while (true) {
			Set<Integer> visited = new HashSet<Integer>();
			n = getHappyNumber(n);
			if (Collections.frequency(visited, n) == 1) {
				return false;
			}
			visited.add(n);
			if (n == 1)
				return true;
			else
				return false;
		}
	}

}
