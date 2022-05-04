package at.ran.OO.GeometricFigures;

public class Rectangle extends Figures {
    private int a;
    private int b;

    public Rectangle(String figureName, int a, int b) {
        super(figureName);
        this.a = a;
        this.b = b;
    }

    @Override
    public int getArea() {
        return a * b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }
}
