package pl.training.mediator;

public class SystemB extends Colleague {

    public SystemB(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void receive(String message) {
        System.out.println("SystemB received: " + message);
    }

}
