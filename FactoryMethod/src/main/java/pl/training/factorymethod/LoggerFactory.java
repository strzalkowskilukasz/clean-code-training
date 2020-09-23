package pl.training.factorymethod;

import java.io.IOException;

public interface LoggerFactory {

    Logger create() throws IOException;

}
