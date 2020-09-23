package pl.training.mediator;

public class App {

    public static void main(String[] args) {
        Mediator mediator = new ApplicationMediator();

        Colleague systemA = new SystemA(mediator);
        mediator.add(systemA);

        Colleague systemB = new SystemB(mediator);
        mediator.add(systemB);

        systemA.broadcast("Hello!");
        systemB.broadcast("Hi!");
    }

}
