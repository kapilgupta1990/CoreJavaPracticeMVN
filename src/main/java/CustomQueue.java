
public class CustomQueue<T> {
	private Object object[];

	private int front;
	private int rear;
	private int size;
	private int capacity;
	int currentSize = 0;

	public CustomQueue(int capacity) {
		this.capacity = capacity;
		front = 0;
		rear = capacity - 1;
		object = new Object[capacity];
	}

	// public CustomStack()
	public void enqueue(T obj) {
		if (currentSize == capacity)
			return;
		else {
			rear++;
			if (rear == capacity - 1) {
				rear = 0;
			}
			object[rear] = obj;
			currentSize++;
		}

	}

	public T dequeue() {

		if (currentSize == 0)
			return null;
		else {
			front++;
			currentSize--;
			if (front == capacity - 1) {

				front = 0;
				return (T) object[front];
			} else {
				return (T) object[front];
			}

		}
	}

	public static void main(String[] args) {
		CustomQueue<Integer> stack = new CustomQueue<>(5);
		stack.enqueue(1);
		stack.enqueue(2);
		stack.enqueue(3);
		stack.enqueue(4);
		stack.enqueue(5);
		// stack.push(6);
		System.out.println(stack.dequeue());
		System.out.println(stack.dequeue());
		System.out.println(stack.dequeue());
		System.out.println(stack.dequeue());
		System.out.println(stack.dequeue());
		// System.out.println(stack.pop());
	}
}
