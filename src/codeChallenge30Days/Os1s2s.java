package codeChallenge30Days;

import java.util.Arrays;

public class Os1s2s {

	public static void main(String[] args) {

		int[] data = perform(new int[] {1,0,2,0,1,0,2,1,2});
		System.out.println(Arrays.toString(data));
		
		int[] data2 = perform2(new int[] {2,0,2,0,1,0,2,1,2});
		System.out.println(Arrays.toString(data2));
	}
	
	//TC O(n) , SC - O(n)
	public static int[] perform2(int[] arr) {
		
		int zeroCount = 0;
		int oneCount = 0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == 0) {
				zeroCount++;
			}else if(arr[i] == 1) {
				oneCount++;
			}
		}
		
		int[] newArray = new int[arr.length];
		for(int j=zeroCount;j<=oneCount+zeroCount;j++) {
			newArray[j] = 1;
		}
		
		for(int k = oneCount+zeroCount;k<newArray.length;k++) {
			newArray[k] = 2;
		}
		return newArray;
		
	}
	

	// TC o(n) and SC - O(1)
	public static int[] perform(int[] arr) {
		
		int low = 0;
		int high = arr.length-1;
		int index = 0;
		
		while(index <=high) {
			switch(arr[index]) {
			case 0:
				int temp = arr[index];
				arr[index] =arr[low];
				arr[low] = temp;
				low++;
				index++;
				break;
			case 1:
				index++;
				break;
			case 2:
				int temp1 = arr[high];
				arr[high] = arr[index];
				arr[index] = temp1;
				high--;
				break;
			
			}
		}
		return arr;
	}
}
