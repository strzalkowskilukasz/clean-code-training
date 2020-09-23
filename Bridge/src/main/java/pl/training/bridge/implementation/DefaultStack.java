package pl.training.bridge.implementation;

import java.util.Stack;

public class DefaultStack<T> implements StackApi<T> {

	private Stack<T> stack = new Stack<>();
	
	@Override
	public void push(T item) {
		stack.push(item);
	}

	@Override
	public T peek() {
		return stack.peek();
	}

	@Override
	public boolean empty() {
		return stack.empty();
	}

	@Override
	public T pop() {
		return stack.pop();
	}

}
