package pl.training.mediator;

public class SystemA extends Colleague {

    public SystemA(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void receive(String message) {
        System.out.println("SystemA received: " + message);
    }

}
