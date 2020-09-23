package pl.training.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class App {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(12);
        numbers.add(2);
        numbers.add(45);

        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        Consumer<Integer> print = number -> {
            if (number > 12) {
                System.out.println(number);
            }
        };

        numbers.parallelStream()
                .filter(Predicates.isEven)
                .map(filteredNumber -> filteredNumber * 2)
                .collect(Collectors.toList());
                //.forEach(print);
    }

    private interface Process<T> {

        void process(T t);

    }

}
