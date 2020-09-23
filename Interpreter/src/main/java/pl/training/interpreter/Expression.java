package pl.training.interpreter;

import java.util.Map;

public interface Expression<T> {

    T resolve(Map<String, T> context);

}
