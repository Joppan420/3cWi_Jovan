package at.ran.OO.Calculator;

public class Root extends Calculator{
    public Root (String brand){
        super (brand);
    }

    public void root(double a){
        double result = Math.sqrt(a);
        System.out.println("Die Wurzel von " + a + " ergibt " +result);
    }

}
