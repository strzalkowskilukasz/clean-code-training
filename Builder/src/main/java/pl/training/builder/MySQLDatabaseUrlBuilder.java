package pl.training.builder;

public class MySQLDatabaseUrlBuilder extends GenericDatabaseUrlBuilder {

    public static final String PROTOCOL = "mysql";
    public static final int PORT = 3306;

    public MySQLDatabaseUrlBuilder() {
        databaseUrl.setProtocol(PROTOCOL);
        databaseUrl.setPort(PORT);
    }

}
