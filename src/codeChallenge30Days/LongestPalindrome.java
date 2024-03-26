package codeChallenge30Days;

public class LongestPalindrome {
	public static void main(String[] args) {
		System.out.println(longestPalindrome("abbaba"));
	}
	    public static String longestPalindrome(String s) {
	        if (s.equals(new StringBuilder(s).reverse().toString())) {
	            return s;
	        }

	        String left = longestPalindrome(s.substring(1));
	        String right = longestPalindrome(s.substring(0, s.length() - 1));

	        if (left.length() > right.length()) {
	            return left;
	        } else {
	            return right;
	        }
	    }
	
}
