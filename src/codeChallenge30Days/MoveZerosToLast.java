package codeChallenge30Days;

import java.util.Arrays;

public class MoveZerosToLast {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(moveZeros(new int[] { 0, 1, 0, 3, 12, 0, 24 })));
	}

	public static int[] moveZeros(int[] nums) {

		int size = nums.length;
		int nxt = 0;
		for (int n : nums) {
			if (n != 0) {
				nums[nxt] = n;
				nxt++;
			}
		}

		for (int i = nxt; i < size; i++) {
			nums[i] = 0;
		}

		return nums;
	}
}
