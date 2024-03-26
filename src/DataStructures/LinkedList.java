package DataStructures;

public class LinkedList {
	Node head;
	public void add(int data) {
		Node node=new Node();
		node.data=data;
		node.next=null;
		if(head==null) {
			head=node;
		}
		else {
			Node n=head;
			while(n.next!=null) {
				n=n.next;
			}
			n.next=node;
		}
		
	}
	public void addAtStart(int data) {
		Node node=new Node();
		node.data=data;
		node.next=null;
		node.next=head;
		head=node;
	}
	public void addAtAny(int index,int data) {
		Node node=new Node();
		node.data=data;
		node.next=null;
		if(index==0) {
			addAtStart(data);
		}
		else {
			Node n=head;
			for(int i=0;i<index-1;i++) {
				n=n.next;
			}
			node.next=n.next;
			n.next=node;
		}
	}
	public void deleteAt(int index) {
		if(index==0) {
			head=head.next;
		}
		else {
			Node n=head;
			Node n1=null;
			for(int i=0;i<index-1;i++) {
				n=n.next;
			}
			n1=n.next;
			n.next=n1.next;
			System.out.println("deleted node= "+n1.data);
			n1=null;
		}
	}
	public void delete(int data) {
		Node node=head;
		Node n1=null;
		while(node.data!=data) {
			n1=node;
			node=node.next;
		}
		
		n1.next=node.next;
		System.out.println("deleted node= "+node.data);
		node=null;		
	}
	public void show() {
		Node node=head;
		while(node.next!=null) {
			System.out.print(node.data+" ");
			node=node.next;
		}
		System.out.print(node.data);
	}

}
