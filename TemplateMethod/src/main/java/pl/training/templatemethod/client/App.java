package pl.training.templatemethod.client;

import pl.training.templatemethod.Compiler;
import pl.training.templatemethod.DesktopCompiler;

public class App {

    public static void main(String[] args) {
        Compiler compiler = new DesktopCompiler();
        //-----------------------------------------
        compiler.compile();
    }

}
