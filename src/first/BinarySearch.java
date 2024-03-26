package first;

public class BinarySearch { 
	// Returns index of x if it is present in arr[], 
	// else return -1 
	int binarySearch(int arr[], int x) 
	{ 
		int l = 0, r = arr.length - 1; 
		//System.out.println(r);
		while (l <= r) { 
			int m = l + (r - l) / 2; 
			//System.out.println(m);

			// Check if x is present at mid 
			if (arr[m] == x) 
				return m; 

			// If x greater, ignore left half 
			if (arr[m] < x) {
				l = m + 1; 
				System.out.println(l);
			}
			// If x is smaller, ignore right half 
			else {
				r = m - 1; 
				System.out.println(r);
			}
		} 

		// if we reach here, then element was 
		// not present 
		return -1; 
	} 

	// Driver method to test above 
	public static void main(String args[]) 
	{ 
		BinarySearch ob = new BinarySearch(); 
		int arr[] = { 234123,345678,983072 }; 
		int n = arr.length; 
		int x = 345678; 
		int result = ob.binarySearch(arr, x); 
		int res=ob.s(arr,x);
		if (res == -1) 
			System.out.println("Element not present"); 
		else
			System.out.println("Element found at "
							+ "index " + result); 
	} 
	
	public int s(int[] u, int x) {
		
		int l=0, r=u.length-1;
		
		while(l<=r) {
			int m = (l+r)/2;
			
			if(u[m] == x) {
				return m;
			}
			
			if(u[m] > x) {
				r = m -1;
			}
			else {
				l = m +1;
			}
		}
		
		return -1;
	}
} 
