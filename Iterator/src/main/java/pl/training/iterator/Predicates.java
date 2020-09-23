package pl.training.iterator;


import java.util.function.Predicate;

public class Predicates {

    public static final Predicate<Integer> isEven = number -> number % 2 == 0;

}
