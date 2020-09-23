package pl.training.factorymethod;

public class ConsoleLoggerFactory implements LoggerFactory {

    @Override
    public Logger create() {

        return new ConsoleLogger();
    }

}
