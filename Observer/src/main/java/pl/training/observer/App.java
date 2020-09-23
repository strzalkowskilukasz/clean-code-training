package pl.training.observer;

public class App {

    public static void main(String[] args) {
        MessageEmitter messageEmitter = new MessageEmitter();
       // messageEmitter.attach(System.out::println);
       // messageEmitter.attach(System.out::println);

        messageEmitter.emit("Hello there!");
    }

}
