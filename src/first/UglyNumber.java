package first;

public class UglyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isUgly(8));
	}
	public static boolean isUgly(int n) {
        for (int i=2; i<6 && n>0; i++){
            while (n % i == 0)
            n /= i;
        }
        return n == 1;
    }

}
