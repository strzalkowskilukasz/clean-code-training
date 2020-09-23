package pl.training.interpreter;

import java.util.Map;

public class Literal implements Expression<Double> {

    private double value;

    public Literal(double value) {
        this.value = value;
    }

    @Override
    public Double resolve(Map<String, Double> context) {
        return value;
    }

}
