package first;

public class BubbleSort {
	void bubbleSort(int arr[]) {
		int n = arr.length - 1;
		for (int i = 0; i < n; i++) {
			System.out.println(arr[i]);
			for (int j = 0; j < n - i; j++) {
				System.out.println(arr[j] + ", " + arr[j + 1]);
				if (arr[j] > arr[j + 1]) {
					// swap arr[j+1] and arr[i]
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
				printArray(arr);
			}
		}
	}

	/* Prints the array */
	void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	// Driver method to test above
	public static void main(String args[]) {
		BubbleSort ob = new BubbleSort();
		int arr[] = { 64, 34, 25, 12, 22, 11, 90 };
		ob.bubbleSort(arr);
		System.out.println("Sorted array");
		ob.printArray(arr);
	}

}
