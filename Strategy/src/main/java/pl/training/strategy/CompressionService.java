package pl.training.strategy;

import java.io.File;
import java.util.List;

public class CompressionService {

    private CompressionStrategy strategy;

    public void setCompressionStrategy(CompressionStrategy strategy) {
        this.strategy = strategy;
    }

    public void createArchive(List<File> files) {
        strategy.compressFiles(files);
    }

}