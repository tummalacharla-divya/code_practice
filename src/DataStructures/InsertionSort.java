package DataStructures;

public class InsertionSort {

	public static void main(String[] args) {
		int[] arr= {7,8,4,3,9,2};	
		System.out.println("befor sorting");
		for(int num:arr) {
			System.out.print(num+" ");
		}
		for(int i=1;i<arr.length;i++) {
			int key=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>key) {
				arr[j+1]=arr[j];
				j=j-1;
			}
			arr[j+1]=key;
		}
		System.out.println();
		System.out.println("after sorting");
		for(int num:arr) {
			System.out.print(num+" ");
		}
	}

}
