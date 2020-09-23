package pl.training.composite;

import java.util.HashSet;
import java.util.Set;

public abstract class Component {

    protected  Component parent;
    protected Set<Component> children = new HashSet<>();

    public Component getParent() {
        return parent;
    }

    public Set<Component> getChildren() {
        return children;
    }

    public void add(Component component) {
        children.add(component);
        component.parent = this;
    }

    private int getParentsCount() {
        int result = 0;
        Component currentComponent = this;
        while ((currentComponent = currentComponent.getParent()) != null) {
            result++;
        }
        return result;
    }

    @Override
    public String toString() {
        return String.format("%" + (getParentsCount() + 1) + "s", " ");
    }

}
