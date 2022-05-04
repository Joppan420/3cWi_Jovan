package at.ran.OO.GeometricFigures;

public class Cube extends Figures {
    private int a;
    private int b;
    private int c;

    public Cube(String figureName, int a, int b, int c) {
        super(figureName);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public int getArea() {
        return a * b * c;
    }
}
