package pl.training.memento.client;

import pl.training.memento.Memento;
import pl.training.memento.Message;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {
        //List<Message.Memento> caretaker = new ArrayList<>();
        List<Memento> caretaker = new ArrayList<>();

        Message message = new Message("Init");
        //caretaker.add(message.createMemento());
        caretaker.add(new Memento(message));
        message.setText("Test");

        System.out.println(message);
        //message.restoreFromMemento(caretaker.get(0));
        caretaker.get(0).restore(message);
        System.out.println(message);
    }

}
