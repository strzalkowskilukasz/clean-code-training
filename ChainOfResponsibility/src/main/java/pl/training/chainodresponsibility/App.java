package pl.training.chainodresponsibility;

public class App {

    public static void main(String[] args) {
        SerializedKeyValueStore<String> serializedKeyValueStore = new SerializedKeyValueStore<>("data.ser");
        KeyValueStore<String> keyValueStore = new InMemoryKeyValueStore<>(serializedKeyValueStore);

        keyValueStore.put("test", "testValue");
        System.out.println(keyValueStore.get("test"));
        System.out.println(keyValueStore.get("test"));
    }

}
