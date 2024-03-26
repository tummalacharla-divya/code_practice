package hackerrank;

import java.util.ArrayList;
import java.util.List;

public class PickingNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l=new ArrayList<Integer>();
		l.add(1);
		l.add(4);
		l.add(4);
		l.add(5);
		l.add(2);
		l.add(3);
		System.out.println(pickingNumber(l));

	}

	private static int pickingNumber(List<Integer> l) {
		// TODO Auto-generated method stub
		int[] arr=new int[20];
		int res=Integer.MIN_VALUE;
		for(int i=0;i<l.size();i++) {
			int value=l.get(i);
			arr[value]++;
		}
		for(int i=1;i<20;i++) {
			res=Math.max(res, arr[i]+arr[i-1]);
		}
		return res;
	}

}
