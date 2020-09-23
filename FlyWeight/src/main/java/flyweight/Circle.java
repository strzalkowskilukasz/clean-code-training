package flyweight;

public class Circle implements Shape {

    private String color;
    private int radius;

    public Circle(String color, int radius) {
        this.color = color;
        this.radius = radius;
        System.out.println("Circle created...");
    }

    @Override
    public void draw(int x, int y) {
        System.out.println(this);
    }

    public String getColor() {
        return color;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "color='" + color + '\'' +
                ", radius=" + radius +
                '}';
    }

}
