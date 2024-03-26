package codeChallenge30Days;

import java.util.ArrayList;
import java.util.List;

public class FindSeries {
	public static void main(String[] args) {
		System.out.println(findSeries(12));
		
	}

	private static List<Integer> findSeries(int n) {
		// TODO Auto-generated method stub
		List<Integer> l=new ArrayList<Integer>();
		for(int i=0;i<10;i++) {
			l.add(n);
			if(i%2==0) {
				n+=2;
			}
			else {
				n-=1;
			}
			
		}
		return l;
	}

}
