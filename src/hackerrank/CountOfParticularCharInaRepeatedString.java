package hackerrank;

public class CountOfParticularCharInaRepeatedString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("count of 'a' in repeated string is: "+countChar("abcd",14));
		System.out.println(maxString("abcd",14));

	}

	private static String maxString(String string, int len) {
		// TODO Auto-generated method stub
		int q1=len/string.length();
		String s="";
		int rem=len%string.length();
		for(int i=0;i<q1;i++) {
			s+=string;
		}
		for(int i=0;i<rem;i++) {
			s+=string.charAt(i);
		}
		return s;
	}

	private static int countChar(String s, int maxlen) {
		// TODO Auto-generated method stub
		int q=maxlen/s.length();
		int rem=maxlen%s.length();
		return (q*maxCount(s,s.length())+maxCount(s,rem));
		
	}

	private static int maxCount(String s, int length) {
		// TODO Auto-generated method stub
		int count=0;
		for(int i=0;i<length;i++) {
			if(s.charAt(i)=='a') {
				count++;
			}
		}
		return count;
	}

}
