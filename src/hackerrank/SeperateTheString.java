package hackerrank;

public class SeperateTheString {

	public static void seperateNumbers(String s) {
		
		String subString = "";
		boolean isValid = false;
		for(int i=1;i<s.length()/2;i++) {
			subString = s.substring(0, i);
			Long num = Long.parseLong(subString);
			String validString = subString;
			while(validString.length() < s.length()) {
				validString +=Long.toString(++num);
			}
			if(s.equals(validString)) {
				isValid = true;
				break;
			}
		}
		System.out.println(isValid == true ? "YES "+subString : "NO");
	}
	
	
	public static void main(String[] args) {
	
		seperateNumbers("99100101");
	}
}
