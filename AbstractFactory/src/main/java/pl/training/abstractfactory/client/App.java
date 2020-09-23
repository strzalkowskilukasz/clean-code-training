package pl.training.abstractfactory.client;

import pl.training.abstractfactory.Connection;
import pl.training.abstractfactory.ConnectionFactory;
import pl.training.abstractfactory.SecuredConnection;
import pl.training.abstractfactory.ftp.FtpConnectionFactory;
import pl.training.abstractfactory.http.HttpConnectionFactory;

public class App {

    public static void main(String[] args) {
        ConnectionFactory connectionFactory = new FtpConnectionFactory();
        //---------------------------------------------------------------
        Connection connection = connectionFactory.createConnection();
        System.out.println(connection.getDescription());
        SecuredConnection securedConnection = connectionFactory.createSecuredConnection();
        System.out.println(securedConnection.getDescription());
    }

}
