package pl.training.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject<T extends  Event> {

    private List<Observer> observers = new ArrayList<>();

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void detach(Observer observer) {
        observers.remove(observer);
    }

    public void notify(T event) {
        observers.forEach(observer -> observer.update(event));
    }

}
