package hackerrank;

public class ChartoRemoveMakePalindrome {

	public static int palindromIndex(String s) {
		
		int stringLen = s.length();
		
		for(int i=0;i<stringLen/2;i++) {
			if(s.charAt(i) != s.charAt(stringLen-i-1)) {
				if((i+1) < stringLen) {
					boolean isValidPali = isValidPalindrom(s.substring(i+1, stringLen-i));
					if(isValidPali)
						return i;
					else
						return stringLen-i-1;
				}
			}
		}
		return -1;
	}
	
	private static boolean isValidPalindrom(String substring) {
		for(int i=0;i<substring.length()/2;i++) {
			if(substring.charAt(i) != substring.charAt(substring.length()-i-1)) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(palindromIndex("aabaaabbaa"));
	}
}
