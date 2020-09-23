package pl.training.factorymethod.client;

import pl.training.factorymethod.ConsoleLoggerFactory;
import pl.training.factorymethod.FileLoggerFactory;
import pl.training.factorymethod.Logger;
import pl.training.factorymethod.LoggerFactory;

public class App {

    public static void main(String[] args) throws Exception {
        LoggerFactory loggerFactory = new FileLoggerFactory();
        //-------------------------------------------------------
        try (Logger logger = loggerFactory.create()) {
            logger.log("Test entry");
        }
    }

}
