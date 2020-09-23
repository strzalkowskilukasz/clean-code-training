package pl.training.interpreter;

import java.util.Map;

public class Multiplication implements Expression<Double> {

    private Expression<Double> leftSideExpression;
    private Expression<Double> rightSideExpression;

    public Multiplication(Expression<Double> leftSideExpression, Expression<Double> rightSideExpression) {
        this.leftSideExpression = leftSideExpression;
        this.rightSideExpression = rightSideExpression;
    }

    @Override
    public Double resolve(Map<String, Double> context) {
        return leftSideExpression.resolve(context) * rightSideExpression.resolve(context);
    }

}
