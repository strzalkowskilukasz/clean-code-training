package pl.training.singleton.client;

import pl.training.singleton.Tasks;

public class App {

    public static void main(String[] args) {
        //Tasks tasks = Tasks.getInstance();
        //System.out.println(tasks == Tasks.getInstance());

        Tasks tasks = Tasks.INSTANCE;
        System.out.println(tasks == Tasks.INSTANCE);
    }

}
