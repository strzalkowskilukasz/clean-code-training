package pl.training.templatemethod;

public abstract class Compiler {

    public final void compile() {
        collectSource();
        compileToTarget();
    }

    protected abstract void collectSource();

    protected abstract void compileToTarget();

}