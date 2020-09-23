package pl.training.abstractfactory.http;

import pl.training.abstractfactory.Connection;
import pl.training.abstractfactory.ConnectionFactory;
import pl.training.abstractfactory.SecuredConnection;

public class HttpConnectionFactory implements ConnectionFactory  {

    @Override
    public Connection createConnection() {
        return new HttpConnection();
    }

    @Override
    public SecuredConnection createSecuredConnection() {
        return new SecuredHttpConnection();
    }

}
