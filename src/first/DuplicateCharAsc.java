package first;

import java.util.LinkedHashMap;

public class DuplicateCharAsc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DuplicateCharAsc ob=new DuplicateCharAsc();
		int[] arr= {8,9,9,9,2,3,3,3,2,4,4,5};
		ob.sort(arr);
		System.out.println("sorted array:");
		ob.print(arr);
		LinkedHashMap<Integer,Integer> map=new LinkedHashMap<Integer, Integer>();
		for(int i=0;i<arr.length;i++) {
			if(map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i])+1);
			}
			else {
				map.put(arr[i], 1);
			}
		}
		int maxvalue=0;
		int maxKey=0;
		String res="";
		int size=map.size();
		for(int i=0;i<size;i++) {
			for(int j:map.keySet()) {
				if(map.get(j)>maxvalue) {
					maxKey=j;
					maxvalue=map.get(j);
				}
			}
			res=res+maxKey+":"+map.get(maxKey)+"\n";
			map.remove(maxKey,map.get(maxKey));
			maxKey=0;
			maxvalue=0;
		}
		System.out.print(res);
		
	}

	void print(int[] arr) {
		// TODO Auto-generated method stub
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

	void sort(int[] arr) {
		// TODO Auto-generated method stub
		for(int i=0;i<arr.length-1;i++) {
			int max=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]>arr[max]) {
					max=j;
				}
			}
			int temp=arr[max];
			arr[max]=arr[i];
			arr[i]=temp;
		}
		
	}

}
