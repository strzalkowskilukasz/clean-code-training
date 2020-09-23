package pl.training.proxy;

import java.io.IOException;
import java.io.Writer;

public class WriterLogger extends Writer {

    private Writer writer;

    public WriterLogger(Writer writer) {
        this.writer = writer;
    }

    @Override
    public void write(char[] cbuf, int off, int len) throws IOException {
        System.out.println("Before write...");
        writer.write(cbuf, off, len);
        System.out.println("After write...");
    }

    @Override
    public void flush() throws IOException {
        writer.flush();
    }

    @Override
    public void close() throws IOException {
        writer.close();
    }

}
