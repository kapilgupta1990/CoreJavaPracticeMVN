import java.util.ArrayList;

public class CustomStack<T> {

	private Object object[] = new Object[5];

	private int top = -1;
	int finalLength = object.length;

	// public CustomStack()
	public void push(T obj) {

		if (top == finalLength - 1) {
			throw new RuntimeException();
		}
		object[++top] = obj;

	}

	public T pop() {

		if (top == -1) {
			throw new RuntimeException();
		}
		return (T) object[top--];
	}

	public static void main(String[] args) {
		CustomStack<Integer> stack = new CustomStack<>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		//stack.push(6);
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		//System.out.println(stack.pop());
	}
}
