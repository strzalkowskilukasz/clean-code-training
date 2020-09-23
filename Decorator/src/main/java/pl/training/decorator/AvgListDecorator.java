package pl.training.decorator;

import java.util.List;

public class AvgListDecorator extends ListDecorator {

    public AvgListDecorator(List<Integer> component) {
        super(component);
    }

    public int avg() {
        return 2;
    }

}
