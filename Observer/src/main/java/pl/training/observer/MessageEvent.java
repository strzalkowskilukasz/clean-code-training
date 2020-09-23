package pl.training.observer;

public class MessageEvent implements Event {

    private String text;

    public MessageEvent(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    @Override
    public String toString() {
        return "MessageEvent{" +
                "text='" + text + '\'' +
                '}';
    }

}
