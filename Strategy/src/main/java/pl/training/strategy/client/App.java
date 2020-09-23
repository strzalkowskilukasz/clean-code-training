package pl.training.strategy.client;

import pl.training.strategy.CompressionService;
import pl.training.strategy.ZipCompressionStrategy;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {
        List<File> files = new ArrayList<>();

        CompressionService compressionService = new CompressionService();
        compressionService.setCompressionStrategy(new ZipCompressionStrategy());
        //----------------------------------------------------------------------
        compressionService.createArchive(files);
    }

}
