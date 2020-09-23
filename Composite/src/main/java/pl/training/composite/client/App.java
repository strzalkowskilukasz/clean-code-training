package pl.training.composite.client;

import pl.training.composite.Group;
import pl.training.composite.User;

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
        testers.add(secondUser);

        System.out.println(firm);
    }

}

