package stack_implementation;

/*
 * Stack Implementation using Arrays
*/

public class MyStack {
	int a[];
	int top;
	int capacity;

	public MyStack(int size) {
		this.capacity = size;
		top = -1;
		a = new int[capacity];
	}

	public void push(int data) throws Exception {
		if (top == capacity - 1) {
			throw new Exception("Stack Overflow");
		}
		top++;
		a[top] = data;
	}

	public int pop() throws Exception {
		if (top == -1) {
			throw new Exception("Stack Underflow");
		}
		int temp = a[top];
		top--;
		return temp;
	}

	public int peek() throws Exception {
		if (top == -1) {
			throw new Exception("Stack Underflow");
		}
		return a[top];
	}

	boolean isEmpty() {
		return top == -1;
	}
}
