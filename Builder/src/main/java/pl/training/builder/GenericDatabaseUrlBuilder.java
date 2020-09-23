package pl.training.builder;

public class GenericDatabaseUrlBuilder implements DatabaseUrlBuilder {

    protected DatabaseUrl databaseUrl = new DatabaseUrl();

    @Override
    public DatabaseUrlBuilder protocol(String protocol) {
        databaseUrl.setProtocol(protocol);
        return this;
    }

    @Override
    public DatabaseUrlBuilder host(String host) {
        databaseUrl.setHost(host);
        return this;
    }

    @Override
    public DatabaseUrlBuilder port(int port) {
        databaseUrl.setPort(port);
        return this;
    }

    @Override
    public DatabaseUrlBuilder databaseName(String databaseName) {
        databaseUrl.setDatabaseName(databaseName);
        return this;
    }

    @Override
    public DatabaseUrl build() {
        return databaseUrl;
    }

}
