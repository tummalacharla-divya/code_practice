package hackerrank;

public class MinCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(minCount("BAAABAABBBB"));
	}

	private static int minCount(String s) {
		// TODO Auto-generated method stub
		
		int minc=0,bc=0;
		for(char c:s.toCharArray()) {
			if(c=='A') {
				minc=Math.min(bc, minc+1);
			}else {
				bc++;
			}
		}
		return minc;
	}

}
