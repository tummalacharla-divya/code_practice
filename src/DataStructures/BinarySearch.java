package DataStructures;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {2,4,6,7,8,9};
		int ele=8;
		int Left=0;
		int Right=nums.length-1; 
		int res=binaryRec(nums,ele,Left,Right);
		if(res!=-1) {
			System.out.println("element is found at "+res+" index");
		}
		else {
			System.out.println("element not found");
		}
	}

	

	private static int binarySearch(int[] nums, int ele) {
		int left=0;
		int right=nums.length-1;
		while(left<right) {
			int mid=(left+right)/2;
			if(nums[mid]==ele) {
				return mid;
			}
			else if(nums[mid]<ele) {
				left=mid+1;
			}
			else if(nums[mid]>ele) {
				right=mid-1;
			}
		}
		return -1;
	}
	public static int binaryRec(int[] nums,int ele,int Left,int Right) {
		while(Left<Right)
		{
			int mid=(Left+Right)/2;
			if(nums[mid]==ele) {
				return mid;
			}
			else if(nums[mid]<ele) {
				return binaryRec(nums,ele,mid+1,Right);
			}
			else {
				return binaryRec(nums,ele,Left,mid-1);
			}
		}
		return -1;
	}

}
