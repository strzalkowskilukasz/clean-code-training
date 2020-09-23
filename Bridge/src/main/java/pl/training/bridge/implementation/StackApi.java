package pl.training.bridge.implementation;

public interface StackApi<T> {
	
	void push(T item);
	
	T peek();
	
	boolean empty();
	
	T pop();

}
