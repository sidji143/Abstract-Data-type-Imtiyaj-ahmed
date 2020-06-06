package QueueImplementation;

public class Queue {
	private long QueueArray[];
	private int maxSize;
	private int front ;
	private int rear ;
	private int nElemts ;
	
	
	public Queue(int size) {
		 this.maxSize = size;
		this.QueueArray = new long[maxSize];
		this.front=0;
		this.rear = -1;
		this.nElemts =0;
	}
	
	public void insert(long j) {
		if(rear == maxSize -1) {
			rear = -1;
		}
		rear++;
		QueueArray[rear] = j;
		nElemts++;
	}
	 public long remove() {
		 long temp = QueueArray[front];
		 front++;
		 if(front == maxSize) {
			 front = 0;
		 }
		 nElemts--;
		 return temp;
	 }
	 public long peek() {
		 return QueueArray[front];
	 }
	
	public void view() {
		System.out.print("[");
		for(int i = 0; i < maxSize; i++) {
			System.out.print(QueueArray[i]+",");
		}
		System.out.println("]");
	}
	
	public boolean isEmpty() {
		return nElemts == 0;
	}
	public boolean isFull() {
		return nElemts == maxSize;
	}
	
}








