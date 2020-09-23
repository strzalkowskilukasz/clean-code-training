package pl.training.bridge.abstraction;

import pl.training.bridge.implementation.StackApi;

public class StackAbstraction<T> {
	
	protected StackApi<T> stack;

	public StackAbstraction(StackApi<T> stack) {
		this.stack = stack;
	}
	
	public void add(T item) {
		stack.push(item);
	}
	
	public T get() {
		return stack.pop();
	}
	
	public boolean isEmpty() {
		return stack.empty();
	}	

}
