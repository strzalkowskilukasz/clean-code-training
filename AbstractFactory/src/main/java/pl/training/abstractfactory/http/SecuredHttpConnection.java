package pl.training.abstractfactory.http;

import pl.training.abstractfactory.SecuredConnection;

public class SecuredHttpConnection implements SecuredConnection {

    @Override
    public String getEncryptionAlgorithm() {
        return "SHA-256";
    }

    @Override
    public String getDescription() {
        return "Https connection";
    }

}
