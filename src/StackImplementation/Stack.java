package StackImplementation;

public class Stack {
		private long stack[];
		private int maxSize;
		private int top;
		
		
		public Stack(int size) {
			this.maxSize= size;
			this.stack = new long[maxSize];
			this.top = -1;
		}
		
		public void push(long j) {
			if(isFull()) {
			System.out.println("Stack is overflow");
			}else {
			top++;
			 stack[top] = j;
		}}
		
		public long pop() {
			if(isEmpty()) {
				System.out.println("Stack is Empty");
				return -1;
			}else {
			 int top_index = top;
			top--;
			return stack[top_index];
		}}
		public long peek() {
			return stack[top];
		}
		
		public boolean isEmpty() {
		return 	top == -1;
		}
		
		public boolean isFull() {
			return maxSize -1 == top;
		}
		
		
}















