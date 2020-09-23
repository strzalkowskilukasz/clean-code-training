package pl.training.mediator;

public abstract class Colleague {

    private Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }

    public void broadcast(String message) {
        mediator.broadcast(message, this);
    }

    public abstract void receive(String message);

}
