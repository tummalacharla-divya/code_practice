package hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Minimax {
	
	public static void miniMax(int[] array) {
		
		List<String> list1 = new ArrayList<String>(); 
		list1.add("One"); 
		list1.add("Two"); 
		list1.add("Three"); 

		List<String> list2 = new ArrayList<String>(); 
		list2.add("Two"); 

		list1.removeAll(list2); 
		System.out.println(list1);
		
		String a = "bikini";
		String b = new String("bikini");
		String c = new String("bikini");
		System.out.println(a == b);
		System.out.println(b == c);
		
		Arrays.sort(array);
		
		int min = array[0];
		int max = array[array.length-1];
		
		int sum = Arrays.stream(array).sum();
		
		int minimumSum = sum - max;
	    int maxSum = sum-min;
		
		System.out.println("MaxSum: "+maxSum+" MinSum: "+minimumSum);
	
	}
	
	public static void main(String[] args) {
		miniMax(new int[] {1,2,5,4,3});
	}

}
