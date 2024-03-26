package hackerrank;

public class MinFlip {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		int[] arr={ 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 1, 0, 1, 0, 1, 1 };
		System.out.println(Math.min(minFlip(arr,0),minFlip(arr,1)));
	}

	private static int minFlip(int[] arr, int k) {
		// TODO Auto-generated method stub
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=k) {
				count++;
			}
			k=toggle(k);
		}
		return count;
	}
	public static int toggle(int k) {
		return (k==0)?1:0;
	}

}
