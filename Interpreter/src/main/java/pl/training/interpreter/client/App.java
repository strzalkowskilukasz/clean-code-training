package pl.training.interpreter.client;

import pl.training.interpreter.*;

import java.util.HashMap;
import java.util.Map;

public class App {

    public static void main(String[] args) {
        // 2 a * 3 + (8 + 1) gdzie a = 6
        Map<String, Double> context = new HashMap<>();
        context.put("a", 6.0);

        Expression<Double> expression = new Sum(
                new Multiplication(
                        new Multiplication(
                                new Literal(2),
                                new Variable("a")
                        ),
                        new Literal(3)
                ),
                new BinaryOperator(new Literal(8), new Literal(1), Action.SUM)
        );
        System.out.println("Result: " + expression.resolve(context));
    }

}
