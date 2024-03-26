package codeChallenge30Days;

public class MaxSumInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(maxSum(new int[] { 1, 4, -5, 1, -4, 6, -2, -5, -1 ,6,1,7}));
		System.out.println(getMaxSubArray(new int[] { 1, 4, -5, 1, -4, 6, -2, -5, -1 ,6,1,7}));
		System.out.println(maxSubArrayValue(new int[] { 1, 4, -5, 1, -4, 6, -2, -5, -1 ,6,1,7}));
	}
	public static int getMaxSubArray(int[] array) {
		int max = Integer.MIN_VALUE, a = 0;
		for (int n : array) {
			a += n;
			max = Math.max(max, a);
			a = Math.max(a, 0);
		}
		return max;
	}
	public static int maxSubArrayValue(int[] arr) {
		
		int max = arr[0];
		int sum = 0;
		
		for(int i=0;i<arr.length;i++) {

			sum = Math.max(arr[i] + sum, arr[i]);
			max = Math.max(sum, max);
			
		}			
		return max;	
	}

	private static int maxSum(int[] a) {
		// TODO Auto-generated method stub
		int sum=0;
		int max=a[0];
		for(int i:a) {
			sum+=i;
			if(sum>max) {
				max=sum;
			}
			if(sum<0) {
				sum=0;
			}
		}
		return max;
	}

}
