package pl.training.prototype.client;

import pl.training.prototype.DatabaseUrl;

public class App {

    public static void main(String[] args) {
        DatabaseUrl mySQLDatabaseUrl = new DatabaseUrl();
        mySQLDatabaseUrl.setProtocol("mysql");
        mySQLDatabaseUrl.setPort(3306);
        mySQLDatabaseUrl.setDatabaseName("training");
        //-----------------------------------------------
        DatabaseUrl databaseUrl = mySQLDatabaseUrl.clone();
        System.out.println(databaseUrl);
    }

}
