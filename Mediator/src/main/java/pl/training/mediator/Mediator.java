package pl.training.mediator;

import java.util.ArrayList;
import java.util.List;

public abstract class Mediator {

    protected List<Colleague> colleagues = new ArrayList<>();

    public void add(Colleague colleague) {
        colleagues.add(colleague);
    }

    public abstract void broadcast(String message, Colleague colleague);

}
