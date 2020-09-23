package pl.training.decorator;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class ListDecorator implements List<Integer> {

    private List<Integer> component;

    public ListDecorator(List<Integer> component) {
        this.component = component;
    }

    @Override
    public int size() {
        return component.size();
    }

    @Override
    public boolean isEmpty() {
        return component.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return component.contains(o);
    }

    @Override
    public Iterator<Integer> iterator() {
        return component.iterator();
    }

    @Override
    public Object[] toArray() {
        return component.toArray();
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return component.toArray(a);
    }

    @Override
    public boolean add(Integer integer) {
        return component.add(integer);
    }

    @Override
    public boolean remove(Object o) {
        return component.remove(o);
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return component.containsAll(c);
    }

    @Override
    public boolean addAll(Collection<? extends Integer> c) {
        return component.addAll(c);
    }

    @Override
    public boolean addAll(int index, Collection<? extends Integer> c) {
        return component.addAll(index, c);
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return component.removeAll(c);
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return component.retainAll(c);
    }

    @Override
    public void replaceAll(UnaryOperator<Integer> operator) {
        component.replaceAll(operator);
    }

    @Override
    public void sort(Comparator<? super Integer> c) {
        component.sort(c);
    }

    @Override
    public void clear() {
        component.clear();
    }

    @Override
    public boolean equals(Object o) {
        return component.equals(o);
    }

    @Override
    public int hashCode() {
        return component.hashCode();
    }

    @Override
    public Integer get(int index) {
        return component.get(index);
    }

    @Override
    public Integer set(int index, Integer element) {
        return component.set(index, element);
    }

    @Override
    public void add(int index, Integer element) {
        component.add(index, element);
    }

    @Override
    public Integer remove(int index) {
        return component.remove(index);
    }

    @Override
    public int indexOf(Object o) {
        return component.indexOf(o);
    }

    @Override
    public int lastIndexOf(Object o) {
        return component.lastIndexOf(o);
    }

    @Override
    public ListIterator<Integer> listIterator() {
        return component.listIterator();
    }

    @Override
    public ListIterator<Integer> listIterator(int index) {
        return component.listIterator(index);
    }

    @Override
    public List<Integer> subList(int fromIndex, int toIndex) {
        return component.subList(fromIndex, toIndex);
    }

    @Override
    public Spliterator<Integer> spliterator() {
        return component.spliterator();
    }

    @Override
    public boolean removeIf(Predicate<? super Integer> filter) {
        return component.removeIf(filter);
    }

    @Override
    public Stream<Integer> stream() {
        return component.stream();
    }

    @Override
    public Stream<Integer> parallelStream() {
        return component.parallelStream();
    }

    @Override
    public void forEach(Consumer<? super Integer> action) {
        component.forEach(action);
    }

}
