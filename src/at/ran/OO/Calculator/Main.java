package at.ran.OO.Calculator;

public class Main {
    public static void main(String[] args) {

        Calculator c1 = new Calculator("TEXAS");
        SinCos sc1 = new SinCos("TEXAS");
        Root r1 = new Root("TEXAS");

        c1.addition(4,20);
        c1.subtraction(56,34);
        c1.multiplication(6,6);
        c1.divide(80,4);

        sc1.sin(80);
        sc1.cos(80);

        r1.root(9);

    }
}
