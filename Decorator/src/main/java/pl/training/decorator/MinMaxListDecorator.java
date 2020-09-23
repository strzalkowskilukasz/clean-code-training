package pl.training.decorator;

import java.util.List;
import java.util.function.BinaryOperator;

public class MinMaxListDecorator extends ListDecorator {

    private static final BinaryOperator<Integer> MIN_OPERATOR = (value, number) -> number > value ? number : value;
    private static final BinaryOperator<Integer> MAX_OPERATOR = (value, number) -> number < value ? number : value;

    public MinMaxListDecorator(List<Integer> component) {
        super(component);
    }

    public int min() {
        return apply(Integer.MAX_VALUE, MAX_OPERATOR);
    }

    public int max() {
        return apply(Integer.MIN_VALUE, MIN_OPERATOR);
    }

    private int apply(int initValue, BinaryOperator<Integer> operator) {
        return stream().reduce(initValue, operator);
    }

}
