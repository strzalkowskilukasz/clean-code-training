package pl.training.mediator;

public class ApplicationMediator extends Mediator {

    @Override
    public void broadcast(String message, Colleague colleague) {
        colleagues.parallelStream()
                .filter(currentColleague -> currentColleague != colleague)
                .forEach(currentColleague -> currentColleague.receive(message));
    }

}
