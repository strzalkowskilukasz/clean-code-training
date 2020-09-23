package pl.training.abstractfactory.http;

import pl.training.abstractfactory.Connection;

public class HttpConnection implements Connection  {

    @Override
    public String getDescription() {
        return "Http connection";
    }

}
