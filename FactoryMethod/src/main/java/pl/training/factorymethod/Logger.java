package pl.training.factorymethod;

import java.io.IOException;

public interface Logger extends AutoCloseable {

    void log(String entry) throws IOException;

    default void close() throws Exception {
    }

}
