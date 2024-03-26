package DataStructures;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList ls=new LinkedList();
		ls.add(12);
		ls.add(4);
		ls.add(7);
		ls.add(38);
		ls.addAtAny(0, 3);
		//ls.deleteAt(4);
		ls.delete(7);
		ls.show();
	}

}
