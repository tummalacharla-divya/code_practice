package first;

public class TreeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree t=new BinaryTree();
		t.insert(8);
		t.insert(28);
		t.insert(2);
		t.insert(4);
		t.insert(9);
		t.insert(37);
		t.insert(21);
		t.inorder();
		System.out.println();
		t.preorder();
		System.out.println();
		t.postorder();
	}

}
