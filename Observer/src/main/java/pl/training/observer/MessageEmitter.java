package pl.training.observer;

public class MessageEmitter extends Subject {

    public void emit(String messageText) {
        notify(new MessageEvent(messageText));
    }

}
