package first;

public class Equilibrium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		findEquilibrium(new int[] {1, 2, 6, 4, 0, -1, 2, 8});

	}

	private static void findEquilibrium(int[] arr) {
		// TODO Auto-generated method stub
		if(arr.length==1) {
			System.out.println("Equilibrum is:"+arr[0]);
		}
		else if(arr.length==2) {
			System.out.println("equilibrum is not possible for two values");
		}
		int[] sums=new int[arr.length];
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
			sums[i]=sum;
		}
		int total=sums[sums.length-1];
		for(int j=1;j<arr.length-1;j++) {
			int leftsum=sums[j]-arr[j];
			int rightsum=total-sums[j];
			if(leftsum==rightsum) {
				System.out.println("equilibrum is:"+arr[j]);
			}
		}
	}

}
