package pl.training.builder.client;

import pl.training.builder.DatabaseUrlBuilder;
import pl.training.builder.GenericDatabaseUrlBuilder;
import pl.training.builder.MySQLDatabaseUrlBuilder;

public class App {

    public static void main(String[] args) {
        DatabaseUrlBuilder databaseUrlBuilder = new MySQLDatabaseUrlBuilder()
                .host("localhost")
                .protocol("postgre")
                .databaseName("Test");
        //---------------------------------------------------------------------------------------------
        Director director = new Director(databaseUrlBuilder);
        System.out.println(director.getDatabaseUrl());
    }

}
