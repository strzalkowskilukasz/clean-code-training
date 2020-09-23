package pl.training.bridge.implementation;

import java.util.ArrayList;
import java.util.List;

public class MyStack<T> implements StackApi<T> {

	private List<T> items = new ArrayList<>();
	
	@Override
	public void push(T item) {
		items.add(item);
	}

	@Override
	public T peek() {
		if (!empty()) {
			return items.get(items.size() - 1);
		}
		return null;
	}

	@Override
	public boolean empty() {
		return items.size() == 0;
	}

	@Override
	public T pop() {
		if (!empty()) {
			return items.remove(items.size() - 1);
		}
		return null;
	}
	

}
