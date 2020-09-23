package pl.training.visitor.client;

import pl.training.visitor.Group;
import pl.training.visitor.Reporter;
import pl.training.visitor.User;

public class App {

    public static void main(String[] args) {
        User firstUser = new User("Jan", "Kowalski");
        User secondUser = new User("Marek", "Nowak");

        Group developers = new Group("Developers");
        Group testers = new Group("Testers");
        Group firm = new Group("Firm");

        firm.add(developers);
        firm.add(testers);

        developers.add(firstUser);
        developers.add(secondUser);

        System.out.println(firm);

        Reporter reporter = new Reporter();
        firm.accept(reporter);
        System.out.println(reporter);
    }

}
