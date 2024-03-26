package codeChallenge30Days;
import java.util.Stack;

class Longest_valid_parenthesis {
	public static void main(String[] args) {
		System.out.println(longest_valid_parenthesis(")()()"));
	}
    public static int longest_valid_parenthesis(String s) {
          Stack<Integer> sa=new Stack<Integer>();
          if(s==null ||s.length()<2) return 0;
          int max=0;
          sa.push(-1);
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                sa.push(i);
            }
            else if(ch==')'){
                sa.pop();
                if(sa.empty()){
                    sa.push(i);
                }
                else
                {
                  max=Math.max(max,i-sa.peek());
                }
            }
           
                
            }
        
      
        return max;
    }
}