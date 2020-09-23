package pl.training.abstractfactory.ftp;

import pl.training.abstractfactory.Connection;
import pl.training.abstractfactory.ConnectionFactory;
import pl.training.abstractfactory.SecuredConnection;

public class FtpConnectionFactory implements ConnectionFactory  {

    @Override
    public Connection createConnection() {
        return new FtpConnection();
    }

    @Override
    public SecuredConnection createSecuredConnection() {
        return new SecuredFtpConnection();
    }

}
