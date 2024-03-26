package DataStructures;

public class StackRunner {
	public static void main(String[] args) {
		DynamicStack s=new DynamicStack();
		
		s.push(7);
		s.push(45);
		s.push(5);
		s.push(51);
		s.push(52);
		s.push(57);
		
		s.show();
		s.pop();
		s.show();
		s.pop();
		s.show();
		s.pop();
		s.show();
	}
}
