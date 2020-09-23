package pl.training.abstractfactory;

public interface SecuredConnection extends Connection {

    String getEncryptionAlgorithm();

}
