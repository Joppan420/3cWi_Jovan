package at.ran.OO.GeometricFigures;

public class Main {
    public static void main(String[] args) {

        Circle ci1 = new Circle("Circle", 4);
        Cube cu1 = new Cube("Cube", 3,3,4);
        Rectangle r1 = new Rectangle("Rectangle", 6, 9);
        Square s1 = new Square("Square",5);


        System.out.println(ci1.getArea() + " " + ci1.getFigureName());
        System.out.println(cu1.getArea() + " " + cu1.getFigureName());
        System.out.println(r1.getArea() + " " + r1.getFigureName());
        System.out.println(s1.getArea() + " " + s1.getFigureName());

    }
}
