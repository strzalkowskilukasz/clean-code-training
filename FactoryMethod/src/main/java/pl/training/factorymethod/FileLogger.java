package pl.training.factorymethod;

import java.io.FileWriter;
import java.io.IOException;

public class FileLogger implements Logger {

    private FileWriter fileWriter;

    public FileLogger(String fileName) throws IOException {
        fileWriter = new FileWriter(fileName);
    }

    @Override
    public void log(String entry) throws IOException {
        fileWriter.write(entry);
        fileWriter.write(System.lineSeparator());
        fileWriter.flush();
    }

    @Override
    public void close() throws Exception {
        fileWriter.close();
    }

}
