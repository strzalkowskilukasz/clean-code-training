package flyweight;

import java.util.Random;

public class App {

    public static void main(String[] args) {
        Random random = new Random();
        String colors[] = {"Red", "Green", "Blue", "Black"};
        int radius = 50;
        CircleManager circleManager = new CircleManager();
        for (int i = 0; i < 20; i++) {
            String color = colors[random.nextInt(colors.length)];
            circleManager.getCircle(color, radius).draw(random.nextInt(100), random.nextInt(100));
        }
    }

}
