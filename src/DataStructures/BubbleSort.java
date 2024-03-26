package DataStructures;

public class BubbleSort {

	public static void main(String[] args) {
		int nums[]= {6,3,5,2,7,5,8};
		System.out.println("before sorting");
		for(int i:nums) {
			System.out.print(i+" ");
		}
		System.out.println("-------------------");
		int temp=0;
		for(int i=0;i<nums.length;i++) {
			for(int j=0;j<nums.length-i-1;j++) {
				if(nums[j]>nums[j+1]) {
					temp=nums[j];
					nums[j]=nums[j+1];
					nums[j+1]=temp;
				}
			}
			for(int k:nums) {
				System.out.print(k+" ");
			}
			System.out.println();
		}
		System.out.println("After sorting");
		for(int num:nums) {
			System.out.print(num+" ");
		}

	}

}
