package pl.training.command;

import java.util.Date;
import java.util.TimerTask;

public class ShowTime extends TimerTask {

    @Override
    public void run() {
        System.out.println(new Date());
    }

}
