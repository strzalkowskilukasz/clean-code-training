package pl.training.builder;

public interface DatabaseUrlBuilder {

    DatabaseUrlBuilder protocol(String protocol);

    DatabaseUrlBuilder host(String host);

    DatabaseUrlBuilder port(int port);

    DatabaseUrlBuilder databaseName(String databaseName);

    DatabaseUrl build();

}
