package pl.training.interpreter;

import java.util.Map;

public interface Action<T> {

    Action<Double> SUM = (leftSideExpression, rightSideExpression, context) -> leftSideExpression.resolve(context) + rightSideExpression.resolve(context);

    T apply(Expression<T> leftSideExpression, Expression<T> rightSideExpression, Map<String, T> context);

}
