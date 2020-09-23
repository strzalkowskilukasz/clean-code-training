package pl.training.chainodresponsibility;

import java.util.LinkedHashMap;
import java.util.Map;

public class InMemoryKeyValueStore<T> extends BaseKeyValueStore<T> {

    private static final int CACHE_SIZE = 200;

    private Map<String, T> data = new LinkedHashMap<String, T>(CACHE_SIZE, 0.75f, true) {

        @Override
        protected boolean removeEldestEntry(Map.Entry<String, T> eldest) {
            return size() > CACHE_SIZE;
        }

    };

    public InMemoryKeyValueStore() {
    }

    public InMemoryKeyValueStore(KeyValueStore<T> nextStore) {
        super(nextStore);
    }

    @Override
    public T get(String key) {
       if (!data.containsKey(key)) {
           data.put(key, super.get(key));
       }
       return data.get(key);
    }

}