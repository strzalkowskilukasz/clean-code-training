package pl.training.prototype;

public class DatabaseUrl implements Cloneable {

    private String protocol = "";
    private String host = "localhost";
    private int port;
    private String databaseName;

    public DatabaseUrl() {
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    @Override
    public String toString() {
        return String.format("jdbc:%s://%s%s/%s", protocol, host, portAsString(), databaseName);
    }

    private String portAsString() {
        return port > 0 ? ": " + port : "";
    }

    @Override
    public DatabaseUrl clone() {
        try {
            return (DatabaseUrl) super.clone();
        } catch (CloneNotSupportedException ex) {
            ex.printStackTrace();
        }
        return new DatabaseUrl();
    }
}
