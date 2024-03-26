package hackerrank;

import java.util.Arrays;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MissingNumber(new int[] {1,2,3,5,6});
	}

	private static void MissingNumber(int[] a) {
		// TODO Auto-generated method stub
		int n=Arrays.stream(a).max().getAsInt();
		int sum1=(n*(n+1))/2;
		int sum=Arrays.stream(a).sum();
		System.out.println("missing number: "+(sum1-sum));
		
	}

}
