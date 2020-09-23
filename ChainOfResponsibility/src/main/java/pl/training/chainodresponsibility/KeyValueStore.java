package pl.training.chainodresponsibility;

public interface KeyValueStore<T> {

    T get(String key);

    void put(String key, T value);

}
