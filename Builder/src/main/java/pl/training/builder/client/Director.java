package pl.training.builder.client;

import pl.training.builder.DatabaseUrl;
import pl.training.builder.DatabaseUrlBuilder;
import pl.training.builder.MySQLDatabaseUrlBuilder;

public class Director {

    private DatabaseUrlBuilder databaseUrlBuilder;

    public Director(DatabaseUrlBuilder databaseUrlBuilder) {
        this.databaseUrlBuilder = databaseUrlBuilder;
    }

    public DatabaseUrl getDatabaseUrl() {
        return databaseUrlBuilder.build();
    }

}
