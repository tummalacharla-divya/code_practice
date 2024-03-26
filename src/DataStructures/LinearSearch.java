package DataStructures;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {4,6,2,5,3,7,4,6};
		int ele=3;
		int res=linearSearch(nums,ele);
		if(res!=-1) {
			System.out.println("element is found at "+res+" index");
		}
		else {
			System.out.println("element not found");
		}
	}

	private static int linearSearch(int[] nums, int ele) {
		for(int i=0;i<nums.length;i++) {
			if(nums[i]==ele) {
				return i;
			}
		}
		return -1;
	}

}
