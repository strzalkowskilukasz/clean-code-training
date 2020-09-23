package pl.training.factorymethod;

import java.io.IOException;

public class FileLoggerFactory implements LoggerFactory {

    private static final String FILE_NAME = "log.txt";

    @Override
    public Logger create() throws IOException {
        return new FileLogger(FILE_NAME);
    }

}
