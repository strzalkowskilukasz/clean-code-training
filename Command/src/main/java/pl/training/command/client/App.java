package pl.training.command.client;

import pl.training.command.ShowTime;

import java.util.Date;
import java.util.Timer;

public class App {

    public static void main(String[] args) {
        Timer invoker = new Timer();
        invoker.scheduleAtFixedRate(new ShowTime(), 0, 1000);

        new Thread(() -> System.out.println(new Date())).start();

        new Thread(new Runnable() {

            @Override
            public void run() {
                System.out.println(new Date());
            }

        }).start();
    }

}
