package at.ran.OO.GeometricFigures;

public class Square extends Figures {
    private int a;

    public Square(String figureName, int a) {
        super(figureName);
        this.a = a;
    }

    @Override
    public int getArea() {
        return a * a;
    }

    public int getA() {
        return a;
    }
}
