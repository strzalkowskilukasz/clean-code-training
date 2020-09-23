package pl.training.bridge.abstraction;

import pl.training.bridge.implementation.StackApi;

public class HanoiStack extends StackAbstraction<Integer> {
	
	private int totalRejectedValues;	

	public HanoiStack(StackApi<Integer> stack) {
		super(stack);
	}

	public int getTotalRejectedValues() {
		return totalRejectedValues;
	}

	@Override
	public void add(Integer item) {
		if (stack.empty() || item < stack.peek()) {
			stack.push(item);
		} else {
			totalRejectedValues++;
		}
	}
	
}
