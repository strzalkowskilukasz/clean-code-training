package pl.training.visitor;

public class Group extends Component {

    private String name;

    public Group(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder(super.toString() + name);
        children.forEach(component -> result.append(System.lineSeparator()).append(component));
        return result.toString();
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
        children.forEach(component -> component.accept(visitor));
    }

}
