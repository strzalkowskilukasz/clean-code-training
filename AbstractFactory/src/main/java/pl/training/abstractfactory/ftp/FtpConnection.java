package pl.training.abstractfactory.ftp;

import pl.training.abstractfactory.Connection;

public class FtpConnection implements Connection  {

    @Override
    public String getDescription() {
        return "Ftp connection";
    }

}
