package pl.training.proxy.client;

import pl.training.proxy.SecuredLogger;
import pl.training.proxy.WriterLogger;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class App {

    public static void main(String[] args) throws IOException {
        try (FileWriter writer = new FileWriter("data.txt")) {
            Writer writerApi =  new SecuredLogger(new WriterLogger(writer));
            writerApi.write("Test entry");
        }
        /*
         try (WriterLogger writer = new WriterLogger(new FileWriter("data.txt"))) {
            writer.write("Test entry");
        }
         */
    }

}
