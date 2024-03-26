package DataStructures;

public class SelectionSort {

	public static void main(String[] args) {
		int nums[]= {2,3,1,7,4,7,5,8};
		int size=nums.length;
		int temp=0,min=-1;
		System.out.println("befor sorting");
		for(int num:nums) {
			System.out.print(num+" ");
		}
		for(int i=0;i<size-1;i++) {
			min=i;
			for(int j=i+1;j<size;j++) {
				if(nums[min]>nums[j]) {
					min=j;
				}
			}
			temp=nums[min];
			nums[min]=nums[i];
			nums[i]=temp;
		}
		System.out.println();
		System.out.println("after sorting");
		for(int num:nums) {
			System.out.print(num+" ");
		}

	}

}
