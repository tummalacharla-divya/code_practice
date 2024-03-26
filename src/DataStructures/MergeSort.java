package DataStructures;

public class MergeSort {

	public static void main(String[] args) {
		int arr[]= {8,2,4,28,6,84};
		System.out.println("before sorting");
		for(int num:arr) {
			System.out.print(num+" ");
		}
		System.out.println();
		mergeSort(arr,0,arr.length-1);
		System.out.println("after sorting");
		for(int num:arr) {
			System.out.print(num+" ");
		}
	}

	private static void mergeSort(int[] arr, int l, int r) {
		if(l<r) {
			int mid=(l+r)/2;
			mergeSort(arr,l,mid);
			mergeSort(arr,mid+1,r);
			merge(arr,l,mid,r);
		}
	}

	private static void merge(int[] arr, int l, int mid,int r) {
		int n1=mid-l+1;
		int n2=r-mid;
		int larr[]=new int[n1];
		int rarr[]=new int[n2];
		for(int x=0;x<n1;x++) {
			larr[x]=arr[l+x];
		}
		for(int x=0;x<n2;x++) {
			rarr[x]=arr[mid+1+x];
		}
		int i=0;
		int j=0;
		int k=l;
		while(i<n1&&j<n2) {
			if(larr[i]<=rarr[j]) {
				arr[k]=larr[i];
				i++;
			}
			else {
				arr[k]=rarr[j];
				j++;
			}
			k++;
		}
		while(i<n1) {
			arr[k]=larr[i];
			i++;
			k++;
		}
		while(j<n2) {
			arr[k]=rarr[j];
			j++;
			k++;
		}
	}

}