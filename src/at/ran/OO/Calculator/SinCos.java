package at.ran.OO.Calculator;

public class SinCos extends Calculator{
    public SinCos(String brand){
        super(brand);
    }

    public void sin(double angle){
        double result = Math.sin(angle);
        System.out.println("Sinus von " + angle + " ergibt " + result);
    }

    public void cos(double angle){
        double result = Math.cos(angle);
        System.out.println("Cosinus von " + angle + " ergibt " + result);
    }

}
