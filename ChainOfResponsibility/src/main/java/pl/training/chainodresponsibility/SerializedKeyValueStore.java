package pl.training.chainodresponsibility;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class SerializedKeyValueStore<T extends Serializable> implements KeyValueStore<T>{

    private String fileName;

    public SerializedKeyValueStore(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public T get(String key) {
        System.out.println("Reading from disk...");
        return loadData().get(key);
    }

    @Override
    public void put(String key, T value) {
        Map<String, T> data = loadData();
        data.put(key, value);
        saveData(data);
    }

    private Map<String, T> loadData() {
        try (FileInputStream fileInputStream = new FileInputStream(fileName);
             ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
            return  (Map<String, T>) objectInputStream.readObject();
        } catch (Exception e) {
            System.out.println("Read from disk failed");
        }
        return new HashMap<>();
    }

    private void saveData(Map<String, T> data) {
        try (FileOutputStream fileOutputStream = new FileOutputStream(fileName);
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);) {
            objectOutputStream.writeObject(data);
        } catch (IOException e) {
            System.out.println("Save to disk failed");
        }
    }

}
