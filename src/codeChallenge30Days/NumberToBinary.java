package codeChallenge30Days;

public class NumberToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(decimalToBinary(132));
		System.out.println(binaryToDecimal(decimalToBinary(132)));
		System.out.println(binaryToDecimal2(Integer.parseInt(decimalToBinary(132))));
	}

	private static String decimalToBinary(int n) {
		// TODO Auto-generated method stub
		String b="";
		while(n>0) {
			b=n%2+""+b;
			n/=2;
		}
		return b;
	}
	public static int binaryToDecimal(String binary) {
		
		return Integer.parseInt(binary,2);
	}
	public static double binaryToDecimal2(int binary) {
		// 11011
		// 1*2 power 0 + 1*2 power 1 + 0*2 power 2 + 1*2 power 3 + 1*2 power 4
		double decimal = 0;
		int power =String.valueOf(binary).length();
		int p=0;
		while(binary!=0&& p<power) {
			int temp = binary%10;
			decimal = decimal + (temp * Math.pow(2, p));
			binary = binary/10;
			p++;
		}
		return decimal;
	}
	

}
