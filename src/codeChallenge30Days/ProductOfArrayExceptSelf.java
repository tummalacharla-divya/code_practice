package codeChallenge30Days;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Arrays.toString(getProductOfArray(new int[] {1,2,3,4})));
		System.out.println(Arrays.toString(getProductOfArray1(new int[] {1,2,3,4})));
		System.out.println(Arrays.toString(getProductOfArrayWithOutSelfWithoutDivision(new int[] {1,2,3,4})));
	}

	private static int[] getProductOfArray(int[] a) {
		// TODO Auto-generated method stub
		int p=1;
		int[] a1=new int[a.length]; 
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				if(i!=j) {
					p*=a[j];
				}
			}
			a1[i]=p;
			p=1;
		}
		return a1;
	}
	public static int[] getProductOfArray1(int[] array) {
		
		int[] product = new int[array.length];
		
		int productOfAll = 1;
		
		for(int i=0;i<array.length;i++) {
			productOfAll = productOfAll * array[i];
		}
		
		for(int i=0;i<array.length;i++) {
			product[i] = productOfAll / array[i];
		}
		
		return product;
	}
	
	//without using division
		// product of everything to the left, times the product of everything to the right of it. 
		
	public static int[] getProductOfArrayWithOutSelfWithoutDivision(int[] array) {
	
		int[] leftProduct = new int[array.length];
		int[] rightProduct = new int[array.length];
		int[] finalProduct = new int[array.length];
		
		leftProduct[0] = 1;
		rightProduct[array.length-1] = 1;
		// 1 2 3 4
		for(int i=1;i<array.length;i++) {
			leftProduct[i] = array[i-1] * leftProduct[i-1]; 
			//leftProduct[0] = array[1-1] * leftProduct[1-1] => 1 * 1 => 1;
			//leftProduct[1] = array[2-1] * leftProduct[2-1] => 2 * 1 => 2;
			//leftProduct[2] = array[3-1] * leftProduct[3-1] => 3 * 2 => 6;
		}
		
		for(int j=array.length-2;j>=0;j--) {
			rightProduct[j] = array[j+1] * rightProduct[j+1];
			//rightProduct[2] = array[2+1] * rightProduct[2+1] => 4 * 1 => 4;
			//rightProduct[1] = array[1+1] * rightProduct[1+1] => 3 * 4 => 12;
			//rightProduct[0] = array[0+1] * rightProduct[0+1] => 2	* 12 => 24;
		}
		
		for(int i=0;i<finalProduct.length;i++) {
			finalProduct[i] = leftProduct[i] * rightProduct[i];
		}
		
		return finalProduct;
	}
		

	

}
