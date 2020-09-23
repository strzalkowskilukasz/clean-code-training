package pl.training.proxy;

import java.io.IOException;
import java.io.Writer;

public class SecuredLogger extends Writer {

    private Writer writer;

    public SecuredLogger(Writer writer) {
        this.writer = writer;
    }

    @Override
    public void write(char[] cbuf, int off, int len) throws IOException {
        System.out.println("Access denied");
    }

    @Override
    public void flush() throws IOException {

    }

    @Override
    public void close() throws IOException {

    }

}
