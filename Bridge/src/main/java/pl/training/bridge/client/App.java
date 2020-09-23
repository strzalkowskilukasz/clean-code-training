package pl.training.bridge.client;

import pl.training.bridge.abstraction.HanoiStack;
import pl.training.bridge.abstraction.StackAbstraction;
import pl.training.bridge.implementation.DefaultStack;
import pl.training.bridge.implementation.MyStack;

public class App {

	public static void main(String[] args) {
		StackAbstraction<Integer> stackAbstraction = new HanoiStack(new DefaultStack<>());
	    //----------------------------------------------------------------------------------------
			stackAbstraction.add(5);
			stackAbstraction.add(3);
			stackAbstraction.add(2);
			stackAbstraction.add(7);
			stackAbstraction.add(1);
			
		while (!stackAbstraction.isEmpty()) {
			System.out.print(stackAbstraction.get() + " ");
		}
			
	}

}
