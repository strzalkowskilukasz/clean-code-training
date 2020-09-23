package pl.training.chainodresponsibility;

public abstract class BaseKeyValueStore<T> implements KeyValueStore<T> {

    protected KeyValueStore<T> nextStore;

    public BaseKeyValueStore() {
    }

    public BaseKeyValueStore(KeyValueStore<T> nextStore) {
        this.nextStore = nextStore;
    }

    public void setNextStore(KeyValueStore<T> nextStore) {
        this.nextStore = nextStore;
    }

    @Override
    public T get(String key) {
        return nextStore != null ? nextStore.get(key) : null;
    }

    @Override
    public void put(String key, T value) {
        if (nextStore != null) {
            nextStore.put(key, value);
        }
    }

}
