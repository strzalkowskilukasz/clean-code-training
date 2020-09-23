package pl.training.memento;

public class Message {

    String text;

    public Message(String text) {
        this.text = text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Message{" +
                "text='" + text + '\'' +
                '}';
    }

    /*public Memento createMemento () {
        return new Memento();
    }

    public void restoreFromMemento(Memento memento) {
        text = new String(memento.state);
    }

    public class Memento  {

        private byte[] state;

        private Memento() {
            state = text.getBytes();
        }

    }*/

}
