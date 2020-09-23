package flyweight;

import java.util.HashMap;
import java.util.Map;

public class CircleManager {

    private Map<String, Circle> circles = new HashMap<>();

    public Circle getCircle(String color, int radius) {
        return circles.computeIfAbsent(color + radius, key -> new Circle(color, radius));
    }

}
