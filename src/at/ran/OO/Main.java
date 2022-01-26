package at.ran.OO;

public class Main {
    public static void main(String[] args) {

        Car c1 = new Car();
        c1.brand = "BMW";
        c1.fuelConsumption = 8;
        c1.serialNumber = "B530";
        c1.color = "black";
        c1.fuelAmount = 70;



        Car c2 = new Car();
        c2.brand = "Mercedes";
        c2.fuelConsumption = 6;
        c2.serialNumber = "M4881";
        c2.color = "white";
        c2.fuelAmount = 20;

        System.out.println(c2.fuelAmount);
        c2.drive();
        System.out.println(c2.fuelAmount);

    }

}
