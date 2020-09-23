package pl.training.visitor;

public class User extends Component {

    private String firstName;
    private String lastName;

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return super.toString() + "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    @Override
    public void add(Component component) {
        throw new IllegalStateException();
    }


    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

}
