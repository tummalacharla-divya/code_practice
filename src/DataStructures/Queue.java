package DataStructures;

public class Queue {
	int queue[]=new int[5];
	int size, front, rear;
	public void enqueue(int data) {
		if(!isFull()) {
			queue[rear]=data;
			rear=(rear+1)%5;
			size++;
		}
		else {
			System.out.println("queue is full");
		}
	}
	public int dequeue() {
		int data=queue[front];
		if(!isEmpty()) {
			front=(front+1)%5;
			size--;
		}
		else {
			System.out.println("queue is empty");
		}
		return data;
	}
	public int size() {
		return size;
	}
	public boolean isEmpty() {
		return size==0;
	}
	public boolean isFull() {
		return size==5;
	}
	public void show() {
		System.out.print("elements: "+" ");
		for(int i=0;i<size;i++) {
			System.out.print(queue[(front+i)%5]+" ");
		}
		System.out.println();
		for(int i:queue) {
			System.out.print(i+" ");
		}
	}
}
