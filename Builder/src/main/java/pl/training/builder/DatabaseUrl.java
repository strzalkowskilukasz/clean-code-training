package pl.training.builder;

public class DatabaseUrl {

    private String protocol = "";
    private String host = "localhost";
    private int port;
    private String databaseName;

    DatabaseUrl() {
    }

    void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    void setHost(String host) {
        this.host = host;
    }

    void setPort(int port) {
        this.port = port;
    }

    void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    @Override
    public String toString() {
        return String.format("jdbc:%s://%s%s/%s", protocol, host, portAsString(), databaseName);
    }

    private String portAsString() {
        return port > 0 ? ": " + port : "";
    }

}
