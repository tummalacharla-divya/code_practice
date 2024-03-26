package DataStructures;

public class QueueRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue q=new Queue();
		q.enqueue(9);
		q.enqueue(5);
		q.enqueue(7);
		q.enqueue(0);
		//q.dequeue();
		//q.dequeue();
		q.enqueue(2);
		q.enqueue(6);
		q.enqueue(4);
		q.enqueue(8);
		q.show();
		System.out.println("size:"+q.size());
		System.out.println("isEmpty:"+q.isEmpty());
		System.out.println("isFull:"+q.isFull());
	}

	
}
