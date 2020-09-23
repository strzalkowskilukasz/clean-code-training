package pl.training.visitor;

import java.util.HashMap;
import java.util.Map;

public class Reporter implements Visitor {

    private Map<String, Integer> data = new HashMap<>();
    private String groupName;

    @Override
    public void visit(Group group) {
        groupName = group.getName();
        data.put(groupName, 0);
    }

    @Override
    public void visit(User user) {
        data.put(groupName, data.get(groupName).intValue() + 1)  ;
    }

    @Override
    public String toString() {
        return "Reporter{" +
                "data=" + data +
                '}';
    }

}
