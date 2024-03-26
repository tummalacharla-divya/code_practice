package hackerrank;

import java.util.Arrays;

public class MergeTwoSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mergTwoSortedArrays(new int[] {1,3,5,0,0,0},3, new int[] {2,4,9},3);
		mergeArray(new int[] {1,3,5,8,10}, new int[] {2,4,9});
	}

	private static void mergeArray(int[] a1, int[] a2) {
		// TODO Auto-generated method stub
		int n=a1.length;
		int m=a2.length;
		int index=0;
		int[] res=new int[m+n];
		
		for(int i=0;i<n;i++) {
			res[index++]=a1[i];
		}
		for(int i=0;i<m;i++) {
			res[index++]=a2[i];
		}
		Arrays.sort(res);
		System.out.println(Arrays.toString(res));
		
	}

	private static void mergTwoSortedArrays(int[] nums1,int m, int[] nums2,int n) {
		// TODO Auto-generated method stub
				
		for (int j = 0, i = m; j < n; j++) {
            nums1[i] = nums2[j];
            i++;
        }
        Arrays.sort(nums1);
		System.out.println(Arrays.toString(nums1));
	}

}
