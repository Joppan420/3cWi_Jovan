package at.ran.OO.GeometricFigures;

public class Circle extends Figures {

    private int radius;

    public Circle(String figureName, int radius) {
        super(figureName);
        this.radius = radius;
    }

    @Override
    public int getArea() {
        return Math.toIntExact(Math.round(Math.PI)) * (radius * radius);
    }

    public int getRadius() {
        return radius;
    }
}
