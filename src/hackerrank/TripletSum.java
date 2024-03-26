package hackerrank;

import java.util.Arrays;

public class TripletSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(tripletSum(new int[] {1,2,3,4,5,6,7},6));

	}

	private static String tripletSum(int[] a, int n) {
		// TODO Auto-generated method stub
		if(a.length<3) {
			return null;
		}
		Arrays.sort(a);
		for(int i=0;i<a.length-1;i++) {
			int second=i+1;
			int third=a.length-1;
			while(second<third) {
				if(a[i]+a[second]+a[third]==n) {
					return a[i]+" "+a[second]+" "+a[third];
				}
				else if(a[i]+a[second]+a[third]<n) {
					second++;
				}
				else {
					third--;
				}
			}
		}
		return "triplet not found";
	}

}
