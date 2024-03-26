package hackerrank;

import java.util.Arrays;

public class EfficientJanitor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		efficientJanitor();
	}

	private static void efficientJanitor() {
		// TODO Auto-generated method stub
		double[] a= {1.001,1.02,1.99,2.0,1.02};
		Arrays.sort(a);
		int left=0,count=0;
		int right=a.length-1;
		while(left<=right) {
			if(left==right) {
				count++;
				break;
			}
			if(a[left]+a[right]<=3.0) {
				left++;
				right--;
				count++;
			}
			else {
				right--;
				count++;
			}
		}
		System.out.println(count);
	}

}
