package DataStructures;

public class Stack {
	int[] stack=new int[5];
	int top=0;
	public void push(int data) {
		if(top==5) {
			System.out.println("stack is full");
		}else {
			stack[top]=data;
			top++;
		}
	}
	public void pop() {
		int data=0;
		if(isEmpty()) {
			System.out.println("stack is empty");
		}
		else {
			top--;
			data=stack[top];
			stack[top]=0;
			System.out.println("popped  item is= "+data);
		}
	}
	public void peek() {
		int data;
		data=stack[top-1];
		System.out.println("peek item is= "+data);
	}
	public void size() {
		System.out.println("size= "+top);
	}
	public boolean isEmpty() {
		return top<=0;
	}
	public void show() {
		for(int n:stack) {
			System.out.print(n+" ");
		}
	}
}
