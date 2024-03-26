package hackerrank;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class TripleSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {3,5,7,7,1,1};
		int[] b = {7,5,9};
		int[] c = {7,9,11,11,13};
		System.out.println(triplets(a, b, c));
	}

	private static int triplets(int[] a, int[] b, int[] c) {
		// TODO Auto-generated method stub
		int[] A=removeDuplicate(a);
		int[] B=removeDuplicate(b);
		int[] C=removeDuplicate(c);
		Arrays.sort(A);
		Arrays.sort(B);
		Arrays.sort(C);
		int count=0;
		for(int i:B) {
			int n=validSet(A,i)+1;
			int m=validSet(C,i)+1;
			count+=n*m;
		}
		return count;
	}

	private static int validSet(int[] a, int q) {
		// TODO Auto-generated method stub
		int l=0;int h = a.length-1;
		int count = -1;
		while(l<=h) {
			int m = l+(h-l)/2;
			if(a[m] <= q) {
				count = m;
				l = m+1;
			}else {
				h = m-1;
			}
		}
		return count;
	}

	private static int[] removeDuplicate(int[] a) {
		// TODO Auto-generated method stub
		Set<Integer> s=new HashSet<Integer>();
		for(int i:a) {
			if(!s.contains(i)) {
				s.add(i);
			}
		}
		int j=0;
		int[] r=new int[s.size()];
		for(int i:s) {
			r[j++]=i;
		}
		return r;
	}

}
