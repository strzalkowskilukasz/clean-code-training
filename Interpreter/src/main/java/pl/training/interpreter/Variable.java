package pl.training.interpreter;

import java.util.Map;

public class Variable implements Expression<Double> {

    private String name;

    public Variable(String  name) {
        this.name = name;
    }

    @Override
    public Double resolve(Map<String, Double> context) {
        return context.get(name);
    }

}
