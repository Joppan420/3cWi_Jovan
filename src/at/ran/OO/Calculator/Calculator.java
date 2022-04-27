package at.ran.OO.Calculator;

public class Calculator {

    private String brand;

    public Calculator(String brand) {
        this.brand = brand;
    }

    public void addition(int a, int b){
        int addedNumbers = a + b;
        System.out.println("Die Zahl " + a + " und " + b + " ergeben zusammen " + addedNumbers);
    }

    public void subtraction(int a, int b){
        int subtractNumbers = a - b;
        System.out.println("Die Zahl " + a + " und " + b + " ergeben subtrahiert " + subtractNumbers);
    }

    public void multiplication(int a, int b){
        int multipliedNumbers = a * b;
        System.out.println("Die Zahl " + a + " und " + b + " ergeben multipliziert " + multipliedNumbers);
    }

    public void divide(int a, int b){
        int divideNumbers = a / b;
        System.out.println("Die Zahl " + a + " und " + b + " ergeben dividiert " + divideNumbers);
    }

}
