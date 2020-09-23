package pl.training.abstractfactory.ftp;

import pl.training.abstractfactory.SecuredConnection;

public class SecuredFtpConnection implements SecuredConnection {

    @Override
    public String getEncryptionAlgorithm() {
        return "SHA-256";
    }

    @Override
    public String getDescription() {
        return "Ftps connection";
    }

}
