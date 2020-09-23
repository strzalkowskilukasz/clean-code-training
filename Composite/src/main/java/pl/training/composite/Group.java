package pl.training.composite;

public class Group extends Component {

    private String name;

    public Group(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder(super.toString() + name);
        children.forEach(component -> result.append(System.lineSeparator()).append(component));
        return result.toString();
    }

}
