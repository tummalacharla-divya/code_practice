package codeChallenge30Days;

public class SubStringPresentInAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(subString("divya","vya"));
	}

	private static String subString(String string, String string2) {
		// TODO Auto-generated method stub
		if(string.matches(".*"+string2+".*")) {
			return "found";
		}
		else {
			return "not found";
		}
		
	}

}
