package pl.training.interpreter;

import java.util.Map;

public class BinaryOperator implements Expression<Double> {

    private Expression<Double> leftSideExpression;
    private Expression<Double> rightSideExpression;
    private Action<Double> action;

    public BinaryOperator(Expression<Double> leftSideExpression, Expression<Double> rightSideExpression, Action<Double> action) {
        this.leftSideExpression = leftSideExpression;
        this.rightSideExpression = rightSideExpression;
        this.action = action;
    }

    @Override
    public Double resolve(Map<String, Double> context) {
        return action.apply(leftSideExpression, rightSideExpression, context);
    }

}
