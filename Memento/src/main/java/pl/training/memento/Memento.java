package pl.training.memento;

public class Memento {

    private byte[] state;

    public Memento(Message message) {
        state = message.text.getBytes();
    }

   public void restore(Message message) {
       message.text = new String(state);
   }

}
