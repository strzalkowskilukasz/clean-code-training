package pl.training.visitor;

public interface Visitor {

    default void visit(Group group) {
    }

    default void visit(User user) {
    }

}
