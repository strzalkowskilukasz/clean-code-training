package pl.training.factorymethod;

import java.io.IOException;

public class ConsoleLogger implements Logger {

    @Override
    public void log(String entry) throws IOException {
        System.out.println(entry);
    }

}
