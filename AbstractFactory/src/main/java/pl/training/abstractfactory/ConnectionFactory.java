package pl.training.abstractfactory;

public interface ConnectionFactory {

    Connection createConnection();

    SecuredConnection createSecuredConnection();

}
